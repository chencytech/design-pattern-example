package com.chaytech.example.singleton;

/**
 * 单例设计模式-懒汉式
 *
 * 保证了一个类在内存中只能有一个对象，比如多程序访问一个配置文件，
 * 希望多程序操作都是同一个配置文件中的数据，那么就需要保证该配置文件对象的唯一性
 *
 * 懒汉式：在需要的时候才会创建对象,多线程环境下，会产生线程安全问题安全
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/04/20 21:30
 */
public class SingletionOfSlacker {

    private static SingletionOfSlacker singletionOfSlacker;

    // 构造方法私有化
    private SingletionOfSlacker() {

    }

    public static SingletionOfSlacker getInstance() {
        if (null == singletionOfSlacker) {
            // 懒汉式在多线程环境下，容易产生线程安全问题，此处加上同步代码块
            synchronized (SingletionOfSlacker.class) {
                singletionOfSlacker = new SingletionOfSlacker();
            }
        }
        return singletionOfSlacker;
    }
}
