package com.chaytech.example.singleton;

/**
 * 单例设计模式-懒汉式
 *
 * 单例模式，是一种常用的软件设计模式。是指在应用整个生命周期内只能存在一个实例。
 * 避免实例的重复创建，即一个类只有一个对象实例，从而减少开销，节省内存。
 *
 * 静态内部类方式
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/04/20 21:30
 */
public class SingletionOfSlacker5 {

    public static class SingletionOfSlackerInstance {
        private static final SingletionOfSlacker5 INSTANCE = new SingletionOfSlacker5();
    }

    // 构造方法私有化
    private SingletionOfSlacker5() {

    }

    public static SingletionOfSlacker5 getInstance() {
        return SingletionOfSlackerInstance.INSTANCE;
    }
}
