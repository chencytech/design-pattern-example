package com.chaytech.example.builder.v1;

/**
 * 汽车指挥者类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 16:40
 */
public class CarDirectory implements ICarDirectory {

    @Override
    public Car constructCar(CarBuilder builder) {
        // 建造发动机
        builder.builderEngine();
        // 建造变速箱
        builder.builderGearbox();
        // 建造底盘
        builder.builderChassis();
        return builder.builderCar();
    }
}
