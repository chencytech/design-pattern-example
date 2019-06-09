package com.chaytech.example.adapter;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/08 18:00
 */
public class TFCardAdapter implements ISDCard {

    private ITFCard tfCard;
    public TFCardAdapter(ITFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSDCard() {
        return tfCard.readSDCard();
    }
}
