package com.chaytech.example.chainofresp;

/**
 * 管理类工厂
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/04/23 21:51
 */
public class ManageFactory {

    public static Manage getManage(){
        Manager manager = new Manager("经理");
        InspectorGeneral inspectorGeneral = new InspectorGeneral("总监");
        GeneralManager generalManager = new GeneralManager("总经理");
        // 设置经理的上级为总监
        manager.setSuperior(inspectorGeneral);
        // 设置总监的上级为总经理
        inspectorGeneral.setSuperior(generalManager);
        return manager;
    }
}
