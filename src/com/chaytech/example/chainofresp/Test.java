package com.chaytech.example.chainofresp;

/**
 * 责任链模式测试类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/05/18 17:37
 */
public class Test {

    public static void main(String[] args) {
        Manage manage = ManageFactory.getManage();

        System.out.println("流程1开始 >>>>>>>>");
        Request requestOne = new Request(RequestTypeEnum.LEAVE.getCode(),1,"生病请假");
        manage.request(requestOne);

        System.out.println("流程2开始 >>>>>>>>");
        Request requestTwo = new Request(RequestTypeEnum.LEAVE.getCode(),5,"休息");
        manage.request(requestTwo);

        System.out.println("流程3开始 >>>>>>>>");
        Request requestThree = new Request(RequestTypeEnum.LEAVE.getCode(),10,"休假");
        manage.request(requestThree);
    }
}
