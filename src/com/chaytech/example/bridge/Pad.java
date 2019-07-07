package com.chaytech.example.bridge;

/**
 * 平板电脑
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/16 16:25
 */
public class Pad extends Computer {
    public Pad(ComputerBrand brand) {
        super(brand);
    }

    @Override
    public void operation() {
        System.out.println(brand.getName() + " pad computer");
    }
}
