package com.pers.keruyun.enums;

public enum KeruyunResultEnum {
    CODE_0(0, "成功[OK]"),
    CODE_1000(1000, "请求参数错误[详细说明]"),
    CODE_1001(1001, "sign计算错误[详细说明]"),
    CODE_1002(1002, "没有权限访问该门店数据"),
    CODE_2000(2000, "业务异常[详细说明]"),
    CODE_2001(2001, "合作者标识错误"),
    CODE_2003(2003, "订单不存在"),
    CODE_2004(2004, "订单已经完成"),
    CODE_2005(2005, "订单已经被取消"),
    CODE_2006(2006, "订单已经被拒绝"),
    CODE_2007(2007, "订单已经被作废"),
    CODE_2008(2008, "订单状态不能被逆转"),
    CODE_2100(2100, "商户信息不存在"),
    CODE_2101(2101, "商户菜品不存在"),
    CODE_3000(3000, "系统异常[详细说明]"),
    CODE_3001(3001, "内部接口异常"),
    CODE_1(-1, "未知异常[UNKNOWN ERROR]");

    private Integer code;

    private String msg;

    KeruyunResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
