package com.chaytech.example.proxy.staticproxy;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/09 16:38
 */
public class Test {
    public static void main(String[] args) {
        IUserService userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
        userServiceProxy.addUser();
    }
}
