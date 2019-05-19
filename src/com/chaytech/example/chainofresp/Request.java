package com.chaytech.example.chainofresp;

/**
 * 请假申请类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/05/18 17:07
 */
public class Request {

    private String type; // 请求类型
    private int days; // 天数
    private String remarks; // 备注

    public Request() {

    }

    public Request(String type, int days, String remarks) {
        this.type = type;
        this.days = days;
        this.remarks = remarks;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }

    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}
