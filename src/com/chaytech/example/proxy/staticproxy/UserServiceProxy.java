package com.chaytech.example.proxy.staticproxy;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/09 16:39
 */
public class UserServiceProxy implements IUserService {

    private IUserService userService;
    public UserServiceProxy(IUserService userService){
        this.userService = userService;
    }

    @Override
    public void addUser() {
        System.out.println("静态代理-开启事务");
        userService.addUser();
        System.out.println("静态代理-关闭事务");
    }
}
