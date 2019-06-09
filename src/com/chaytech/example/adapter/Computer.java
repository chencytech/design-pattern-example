package com.chaytech.example.adapter;

/**
 * 计算机类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/08 17:10
 */
public class Computer {

    public String readCard(ISDCard readCard){
        return readCard.readSDCard();
    }
}
