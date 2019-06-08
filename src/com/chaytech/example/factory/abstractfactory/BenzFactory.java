package com.chaytech.example.factory.abstractfactory;

/**
 * 奔驰工厂类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 15:55
 */
public class BenzFactory implements ICarFactory {
    
    @Override
    public IEngine productionEngine() {
        return new BenzEngine();
    }

    @Override
    public IGearbox productionGearbox() {
        return new BenzGearbox();
    }

    @Override
    public IChassis productionChassis() {
        return new BenzChassis();
    }
}