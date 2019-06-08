package com.chaytech.example.builder.v1;

/**
 * 奥迪汽车建造者
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 16:37
 */
public class AudiCarBuilder extends CarBuilder {

    private Car car;

    public AudiCarBuilder(){
        this.car = new Car();
    }

    @Override
    public void builderEngine() {
        car.setEngine(new Engine("奥迪牌发动机"));
    }

    @Override
    public void builderGearbox() {
        car.setGearbox(new Gearbox("奥迪牌变速箱"));
    }

    @Override
    public void builderChassis() {
        car.setChassis(new Chassis("奥迪牌底盘"));
    }

    @Override
    public Car builderCar() {
        return car;
    }
}
