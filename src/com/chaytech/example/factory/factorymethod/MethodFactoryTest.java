package com.chaytech.example.factory.factorymethod;


public class MethodFactoryTest {
	public static void main(String[] args) {
		ICar car1 = new AudiFactory().getCar();
		ICar car2 = new BenzFactory().getCar();

		System.out.println(car1.getCarName());
		System.out.println(car2.getCarName());
	}
}
