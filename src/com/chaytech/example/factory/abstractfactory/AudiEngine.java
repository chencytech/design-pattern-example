package com.chaytech.example.factory.abstractfactory;

import com.sun.xml.internal.ws.api.pipe.Engine;

/**
 * 奥迪发动机生产类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 15:51
 */
public class AudiEngine implements IEngine {

    @Override
    public void produce() {
        System.out.println("生产奥迪发动机");
    }
}
