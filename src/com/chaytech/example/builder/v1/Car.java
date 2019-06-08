package com.chaytech.example.builder.v1;

/**
 * 汽车类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 15:33
 */
public class Car {

    private Engine engine; // 发动机
    private Gearbox gearbox; // 变速箱
    private Chassis chassis; // 底盘

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }
}
