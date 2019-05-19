package com.chaytech.example.chainofresp;

/**
 * 经理类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/05/18 17:58
 */
public class Manager extends Manage  {
    public Manager(String level){
        super(level);
    }

    @Override
    public void request(Request request) {
        // 经理能处理2天以内的请假申请
        if (RequestTypeEnum.LEAVE.getCode().equals(request.getType()) && request.getDays() <= 2) {
            System.out.println("经理开始处理 >>>>>>>");
            System.out.println("因" + request.getRemarks() + ",需请假" + request.getDays() + "天,已批准。");
        } else {
            // 处理不了的传递给上级
            if (superior != null) {
                System.out.println("经理处理不了，需上级处理 >>>>>>>");
                superior.request(request);
            }
        }
    }
}
