package com.chaytech.example.factory.abstractfactory;

/**
 * 奔驰发动机生产类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 15:51
 */
public class BenzEngine implements IEngine {

    @Override
    public void produce() {
        System.out.println("生产奔驰发动机");
    }
}
