package com.chaytech.example.factory;

/**
 * 工厂模式
 *
 * 工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/04/20 22:03
 */
public class CarFactory {
    public static ICar getCar(String carName) {
        ICar car = null;
        switch (carName) {
            case "奥迪":
                car = new Audi();
                break;
            case "奔驰":
                car = new Benz();
                break;
            default:
                System.out.println("未知的汽车品牌");
                break;
        }
        return car;
    }
}
