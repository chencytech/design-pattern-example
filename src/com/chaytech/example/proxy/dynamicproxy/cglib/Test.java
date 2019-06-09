package com.chaytech.example.proxy.dynamicproxy.cglib;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/09 18:16
 */
public class Test {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        IUserService userService = (UserServiceImpl) cglibProxy.newInstance(new UserServiceImpl());
        userService.addUser();
    }
}
