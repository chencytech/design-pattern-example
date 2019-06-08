package com.chaytech.example.prototype;

import com.chaytech.example.singleton.SingletionOfHungry1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/07 22:00
 */
public class Test {

    public static void main(String[] args) throws Exception{
        int size = 1000000;
        newCreateObj(size);
        cloneCreateObj(size);
    }

    public static void newCreateObj(int size){
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Sheep sheep = new Sheep();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用new创建对象耗时：" + (end - start));
    }

    public static void cloneCreateObj(int size)throws Exception{
        long start = System.currentTimeMillis();
        Sheep sheep = new Sheep();
        for (int i = 0; i < size; i++) {
            Sheep temp = (Sheep)sheep.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用clone创建对象耗时：" + (end - start));
    }
}
