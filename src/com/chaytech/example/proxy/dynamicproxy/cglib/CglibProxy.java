package com.chaytech.example.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 自定义方法拦截器，需要实现intercept方法，实现具体拦截处理
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/09 18:07
 */
public class CglibProxy implements MethodInterceptor {

    private Object target; // 需要代理的目标对象
    public Object newInstance(Object target) {
        this.target = target;
        // 字节码增强器,通过字节码技术动态创建委托类的子类实例
        Enhancer enhancer = new Enhancer();
        // 设置代理目标
        enhancer.setSuperclass(target.getClass());
        // 设置单一回调对象，在调用中拦截对目标方法的调用
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }


    /**
     * 实现具体拦截处理
     *
     * @param o 动态生成的代理对象
     * @param method 实际调用的方法
     * @param objects 调用方法入参
     * @param methodProxy java Method类的代理类，可以实现委托类对象的方法的调用
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib动态代理-开启事务");
        // Object result = method.invoke(obj, args); //直接使用obj调用方法，会发生和java动态代理一样的无限循环调用
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("Cglib动态代理-关闭事务");
        return object;
    }
}
