package com.chaytech.example.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 深克隆
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/07 21:55
 */
public class SheepSerializeClone implements Serializable{

    private String name;
    private Date birthday;

    public SheepSerializeClone(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

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
}
