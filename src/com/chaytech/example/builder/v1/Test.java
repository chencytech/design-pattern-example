package com.chaytech.example.builder.v1;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 16:47
 */
public class Test {
    public static void main(String[] args) {
        ICarDirectory directory = new CarDirectory();

        Car benzCar = directory.constructCar(new BenzCarBuilder());
        System.out.println(benzCar.getEngine().getName());
        System.out.println(benzCar.getGearbox().getName());
        System.out.println(benzCar.getChassis().getName());

        Car audiCar = directory.constructCar(new AudiCarBuilder());
        System.out.println(audiCar.getEngine().getName());
        System.out.println(audiCar.getGearbox().getName());
        System.out.println(audiCar.getChassis().getName());
    }
}
