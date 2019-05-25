package com.chaytech.example.factory.factorymethod;

public class BenzFactory implements ICarFactory {

	@Override
	public ICar getCar() {
		return new Benz();
	}

}
