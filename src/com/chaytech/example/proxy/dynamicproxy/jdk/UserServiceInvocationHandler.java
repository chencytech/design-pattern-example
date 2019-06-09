package com.chaytech.example.proxy.dynamicproxy.jdk;

import com.sun.xml.internal.ws.api.policy.SourceModel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 通过实现InvocationHandler接口自定义调用处理器
 * 每一个代理的实例都会有一个关联的调用处理程序(InvocationHandler)。
 * 对代理实例进行调用时，将对方法的调用进行编码并指派到它的调用处理器(InvocationHandler)的invoke方法。
 * 所以对代理对象实例方法的调用都是通过InvocationHandler中的invoke方法来完成的，
 * 而invoke方法会根据传入的代理对象、方法名称以及参数决定调用代理的哪个方法
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/09 17:06
 */
public class UserServiceInvocationHandler implements InvocationHandler {

    private Object target; // 需要代理的目标对象
    public UserServiceInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Jdk动态代理-开启事务");
        // 执行目标对象的方法
        method.invoke(target);
        System.out.println("Jdk动态代理-关闭事务");
        return null;
    }
}
