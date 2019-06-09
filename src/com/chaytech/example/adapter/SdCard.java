package com.chaytech.example.adapter;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/08 17:09
 */
public class SdCard implements ISDCard {
    @Override
    public String readSDCard() {
        return "read sd card success";
    }
}
