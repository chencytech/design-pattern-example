package com.chaytech.example.chainofresp;

/**
 * 请求类型枚举类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/05/18 17:22
 */
public enum RequestTypeEnum {

    LEAVE("leave","请假");

    private String code;
    private String desc;

    private RequestTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 通过code取得类型
     *
     * @param code
     * @return
     */
    public static RequestTypeEnum getProductFeeTypeEnum(String code) {
        for (RequestTypeEnum type : RequestTypeEnum.values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return null;
    }
}
