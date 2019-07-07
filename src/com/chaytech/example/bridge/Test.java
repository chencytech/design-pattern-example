package com.chaytech.example.bridge;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/16 16:26
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Desktop(new Lenovo());
        computer.operation();

        Computer computer2 = new Desktop(new Dell());
        computer2.operation();
    }
}
