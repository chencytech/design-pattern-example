package com.chaytech.example.builder.v1;

/**
 * 汽车变速箱类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 15:50
 */
public class Gearbox {

    private String name;

    public Gearbox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
