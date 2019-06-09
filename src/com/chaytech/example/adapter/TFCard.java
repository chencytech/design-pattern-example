package com.chaytech.example.adapter;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/08 17:55
 */
public class TFCard implements ITFCard {
    @Override
    public String readSDCard() {
        return "read tf card success";
    }
}
