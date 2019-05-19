package com.chaytech.example.chainofresp;

/**
 * 管理者抽象类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/05/18 17:04
 */
public abstract class Manage {
    protected String level;
    protected Manage superior;

    public  Manage(String level){
        this.level = level;
    }

    /**
     * 设置管理者上级
     *
     * @param superior
     */
    public void setSuperior(Manage superior) {
        this.superior = superior;
    }

    /**
     * 申请请求
     *
     * @param request
     */
    public abstract void request(Request request);
}
