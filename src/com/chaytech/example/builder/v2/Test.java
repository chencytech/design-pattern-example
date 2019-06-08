package com.chaytech.example.builder.v2;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/04 22:11
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person.Builder().name("小明").age("20").sex("男").build();
    }
}
