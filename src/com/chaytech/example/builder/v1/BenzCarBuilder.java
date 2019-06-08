package com.chaytech.example.builder.v1;

/**
 * 奔驰汽车建造者
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 16:50
 */
public class BenzCarBuilder extends CarBuilder {

    private Car car;

    public BenzCarBuilder(){
        this.car = new Car();
    }

    @Override
    public void builderEngine() {
        car.setEngine(new Engine("奔驰牌发动机"));
    }

    @Override
    public void builderGearbox() {
        car.setGearbox(new Gearbox("奔驰牌变速箱"));
    }

    @Override
    public void builderChassis() {
        car.setChassis(new Chassis("奔驰牌底盘"));
    }

    @Override
    public Car builderCar() {
        return car;
    }
}
