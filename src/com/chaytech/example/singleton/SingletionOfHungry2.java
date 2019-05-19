package com.chaytech.example.singleton;

/**
 * 单例设计模式-饿汉式
 *
 * 单例模式，是一种常用的软件设计模式。是指在应用整个生命周期内只能存在一个实例。
 * 避免实例的重复创建，即一个类只有一个对象实例，从而减少开销，节省内存。
 *
 * 枚举方式实现
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/04/20 21:30
 */
public enum SingletionOfHungry2 {
    // 定义一个枚举元素，代表SingletionOfHungry2的实例
    INSTANCE;

    /**
     * 枚举也可以定义具体操作
     */
    public void operation(){

    }
}
