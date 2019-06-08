package com.chaytech.example.factory.abstractfactory;

/**
 * 奥迪工厂类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 15:55
 */
public class AudiFactory implements ICarFactory {

    @Override
    public IEngine productionEngine() {
        return new AudiEngine();
    }

    @Override
    public IGearbox productionGearbox() {
        return new AudiGearbox();
    }

    @Override
    public IChassis productionChassis() {
        return new AudiChassis();
    }
}