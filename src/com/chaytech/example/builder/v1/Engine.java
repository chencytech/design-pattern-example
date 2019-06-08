package com.chaytech.example.builder.v1;

/**
 * 汽车发动机类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 15:50
 */
public class Engine {

    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
