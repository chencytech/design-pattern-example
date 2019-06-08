package com.chaytech.example.builder.v1;

/**
 * 汽车指挥者
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 16:36
 */
public interface ICarDirectory {

    /**
     * 建造汽车
     *
     * @return
     */
    Car constructCar(CarBuilder builder);
}
