package com.chaytech.example.factory.abstractfactory;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/02 15:49
 */
public interface ICarFactory {
    /**
     * 生产发动机
     *
     * @return
     */
    IEngine productionEngine();

    /**
     * 生产变速箱
     *
     * @return
     */
    IGearbox productionGearbox();

    /**
     * 生产底盘
     *
     * @return
     */
    IChassis productionChassis();
}
