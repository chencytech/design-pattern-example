package com.chaytech.example.prototype;

import java.util.Date;

/**
 * 浅克隆
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/07 21:55
 */
public class Sheep implements Cloneable{

    private String name;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // 直接调用Object类的克隆方法
    }
}
