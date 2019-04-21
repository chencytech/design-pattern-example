package com.chaytech.example.singleton;

/**
 * 单例设计模式-饿汉式
 *
 * 保证了一个类在内存中只能有一个对象，比如多程序访问一个配置文件，
 * 希望多程序操作都是同一个配置文件中的数据，那么就需要保证该配置文件对象的唯一性
 *
 * 饿汉式：当class文件被加载的时候就初始化，不会产生现成安全问题
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/04/20 21:30
 */
public class SingletionOfHungry {

    // 当class文件加载时初始化
    private static SingletionOfHungry singletionOfHungry = new SingletionOfHungry();

    // 构造方法私有化
    private SingletionOfHungry(){

    }

    public static SingletionOfHungry getInstance(){
        return singletionOfHungry;
    }
}
