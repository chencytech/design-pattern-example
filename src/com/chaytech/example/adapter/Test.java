package com.chaytech.example.adapter;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/08 17:04
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ISDCard card = new SdCard();
        System.out.println(computer.readCard(card));

        ITFCard tfCard = new TFCard();
        System.out.println(computer.readCard(new TFCardAdapter(tfCard)));
    }
}
