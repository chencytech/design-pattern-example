package com.chaytech.example.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 单例设计模式-饿汉式
 *
 * 单例模式，是一种常用的软件设计模式。是指在应用整个生命周期内只能存在一个实例。
 * 避免实例的重复创建，即一个类只有一个对象实例，从而减少开销，节省内存。
 *
 * 饿汉式：当class文件被加载的时候就初始化，不会产生现成安全问题
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/04/20 21:30
 */
public class SingletionOfHungry1 implements Serializable{

    // 当class文件加载时初始化
    private static SingletionOfHungry1 singletionOfHungry = new SingletionOfHungry1();

    // 构造方法私有化
    private SingletionOfHungry1(){
        if(null != singletionOfHungry){
            throw new RuntimeException("此类只能创建一个对象");
        }
    }

    public static SingletionOfHungry1 getInstance(){
        return singletionOfHungry;
    }
    // 反序列化时，如果对象所在类定义了readResolve()则会自动调用这个 `readResolve()`方法来返回我们指定好的对象了
    private Object readResolve() throws ObjectStreamException {
        return singletionOfHungry;
    }
}
