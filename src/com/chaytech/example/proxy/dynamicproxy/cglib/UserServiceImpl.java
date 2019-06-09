package com.chaytech.example.proxy.dynamicproxy.cglib;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/09 16:38
 */
public class UserServiceImpl implements IUserService {
    @Override
    public void addUser() {
        System.out.println("add user ...");
    }
}
