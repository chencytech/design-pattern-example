package com.chaytech.example.proxy.dynamicproxy.jdk;

import java.lang.reflect.Proxy;

/**
 * Jdk动态代理：通过调用`Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)`方法，
 * 传入目标代理对象的类加载器(`ClassLoader`)、目标代理对象所实现的所有接口(`interfaces`)、实现`InvocationHandler `接口的自定义调用处理器（用于实现目标代理对象方法前后的处理逻辑）等参数，
 * 通过反射动态生成代理类字节码，并加载代理类，最后返回目标代理类的代理对象。
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/09 17:10
 */
public class Test {
    public static void main(String[] args) {
        IUserService userService = new UserServiceImpl();
        UserServiceInvocationHandler userServiceInvocationHandler = new UserServiceInvocationHandler(userService);
        // 获取被代理对象类加载器
        ClassLoader classLoader = userService.getClass().getClassLoader();
        // 获取被代理对象所实现的所有接口
        Class<?>[] interfaces = userService.getClass().getInterfaces();

        /**
         * 通过反射动态生成代理类对象
         *
         *  newProxyInstance执行的操作：
         *  1.生成一个实现了参数interfaces里所有接口且继承了Proxy的代理类的字节码，然后用参数里的classLoader加载这个代理类
         *  2.使用代理类父类的构造函数 Proxy(InvocationHandler h)来创造一个代理类的实例，将我们自定义的InvocationHandler的实现类传入。
         *  3.返回这个代理类实例
         */
        IUserService userServiceProxy = (IUserService) Proxy.newProxyInstance(classLoader,interfaces,userServiceInvocationHandler);
        userServiceProxy.addUser();
    }
}
