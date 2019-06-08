package com.chaytech.example.factory.abstractfactory;

/**
 * 奔驰汽车底盘生产类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 15:53
 */
public class BenzChassis implements IChassis {

    @Override
    public void produce() {
        System.out.println("生产奔驰底盘");
    }
}
