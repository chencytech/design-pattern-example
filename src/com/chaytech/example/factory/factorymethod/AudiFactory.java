package com.chaytech.example.factory.factorymethod;

public class AudiFactory implements ICarFactory {

	@Override
	public ICar getCar() {
		return new Audi();
	}

}
