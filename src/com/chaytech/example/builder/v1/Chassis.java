package com.chaytech.example.builder.v1;

/**
 * 汽车底盘类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 15:51
 */
public class Chassis {

    private String name;

    public Chassis(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
