package com.chaytech.example.factory.abstractfactory;

/**
 * 奔驰变速箱生产类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 15:52
 */
public class BenzGearbox implements IGearbox {

    @Override
    public void produce() {
        System.out.println("生产奔驰变速箱");
    }
}
