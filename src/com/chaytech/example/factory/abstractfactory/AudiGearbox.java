package com.chaytech.example.factory.abstractfactory;

/**
 * 奥迪变速箱生产类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 15:52
 */
public class AudiGearbox implements IGearbox {

    @Override
    public void produce() {
        System.out.println("生产奥迪变速箱");
    }
}
