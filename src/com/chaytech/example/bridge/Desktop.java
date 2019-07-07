package com.chaytech.example.bridge;

/**
 * 台式机电脑
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/16 16:23
 */
public class Desktop extends Computer {

    public Desktop(ComputerBrand brand) {
        super(brand);
    }

    @Override
    public void operation() {
        System.out.println(brand.getName() + " desktop computer");
    }
}
