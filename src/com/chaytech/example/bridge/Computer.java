package com.chaytech.example.bridge;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/16 16:21
 */
public abstract class Computer {
    protected ComputerBrand brand;

    public Computer(ComputerBrand brand) {
        this.brand = brand;
    }

    public abstract void operation();
}
