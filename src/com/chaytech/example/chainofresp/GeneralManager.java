package com.chaytech.example.chainofresp;

/**
 * 总经理
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/05/18 17:20
 */
public class GeneralManager extends Manage {

    public GeneralManager(String level){
        super(level);
    }

    @Override
    public void request(Request request) {
        // 总经理可处理任意天数的请假申请
        if (RequestTypeEnum.LEAVE.getCode().equals(request.getType())) {
            System.out.println("总经理开始处理 >>>>>>>");
            System.out.println("因" + request.getRemarks() + ",需请假" + request.getDays() + "天,已批准。");
        }
    }
}
