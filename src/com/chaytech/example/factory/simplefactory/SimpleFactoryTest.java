package com.chaytech.example.factory.simplefactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        ICar audi = CarFactory.getCar("奥迪");
        System.out.println(audi.getCarName());

        ICar benz = CarFactory.getCar("奔驰");
        System.out.println(benz.getCarName());

        ICar bmw = CarFactory.getCar("宝马");
    }
}
