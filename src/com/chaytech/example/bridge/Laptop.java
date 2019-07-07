package com.chaytech.example.bridge;

/**
 * 笔记本电脑
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/16 16:24
 */
public class Laptop extends Computer {
    public Laptop(ComputerBrand brand) {
        super(brand);
    }

    @Override
    public void operation() {
        System.out.println(brand.getName() + " laptop computer");
    }
}
