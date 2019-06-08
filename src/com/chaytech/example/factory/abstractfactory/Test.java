package com.chaytech.example.factory.abstractfactory;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 15:57
 */
public class Test {

    public static void main(String[] args) {
        ICarFactory audiFactory = new AudiFactory();

        audiFactory.productionEngine().produce();
        audiFactory.productionGearbox().produce();
        audiFactory.productionChassis().produce();
    }
}
