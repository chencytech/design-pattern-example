package com.chaytech.example.singleton;

import sun.applet.Main;


public class SingletionTest {

    public static void main(String[] args) {
        SingletionOfHungry singletionOfHungry1 = SingletionOfHungry.getInstance();
        SingletionOfHungry singletionOfHungry2 = SingletionOfHungry.getInstance();
        System.out.println("单例模式饿汉式：" + (singletionOfHungry1 == singletionOfHungry2));

        SingletionOfSlacker singletionOfSlacker1 = SingletionOfSlacker.getInstance();
        SingletionOfSlacker singletionOfSlacker2 = SingletionOfSlacker.getInstance();
        System.out.println("单例模式懒汉式：" + (singletionOfSlacker1 == singletionOfSlacker2));
    }
}
