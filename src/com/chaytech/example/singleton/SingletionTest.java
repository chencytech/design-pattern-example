package com.chaytech.example.singleton;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

public class SingletionTest {

    public static void main(String[] args) throws Exception {
        
//        int threadNum = 10;
//        for (int i = 0; i < threadNum; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(SingletionOfHungry2.INSTANCE.hashCode());
//                }
//            }).start();
//        }

        // 通过反射调用私有构造方法
//        Class<SingletionOfHungry1> clazz = (Class<SingletionOfHungry1>)Class.forName("com.chaytech.example.singleton.SingletionOfHungry1");
//        Constructor<SingletionOfHungry1> constructor = clazz.getDeclaredConstructor(null);
//        constructor.setAccessible(true);
//        SingletionOfHungry1 s1 = constructor.newInstance();
//        SingletionOfHungry1 s2 = constructor.newInstance();
//        System.out.println(s1);
//        System.out.println(s2);
        SingletionOfHungry1 s1 = SingletionOfHungry1.getInstance();
        FileOutputStream outputStream = new FileOutputStream("E:/test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(s1);
        objectOutputStream.close();
        outputStream.close();
        System.out.println(s1);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("E:/test.txt"));
        SingletionOfHungry1 obj1 = (SingletionOfHungry1) inputStream.readObject();
        System.out.println(obj1);
    }
}
