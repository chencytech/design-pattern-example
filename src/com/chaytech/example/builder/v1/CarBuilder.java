package com.chaytech.example.builder.v1;

/**
 * 汽车建造者抽象类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 16:21
 */
public abstract class CarBuilder {

    /**
     * 建造汽车发动机
     *
     * @return
     */
    public abstract void builderEngine();

    /**
     * 建造汽车变速箱
     *
     * @return
     */
    public abstract void builderGearbox();

    /**
     * 建造汽车底盘
     *
     * @return
     */
    public abstract void builderChassis();

    /**
     * 建造汽车
     *
     * @return
     */
    public abstract Car builderCar();
}
