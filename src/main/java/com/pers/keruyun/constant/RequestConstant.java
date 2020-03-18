package com.pers.keruyun.constant;

/**
 * API接口信息
 * 外卖流程图：http://store.keruyun.com/bbs/forum.php?mod=viewthread&tid=11&extra=page%3D1
 */
public class RequestConstant {

    /**
     * 开放平台接口地址，正式账号/测试账号采用同一地址
     */
    public static final String API_URL = "https://openapi.keruyun.com";
    //public static final String API_URL = "https://gldopenapi.keruyun.com";
    public static final String API_URL_OAUTH2 = "https://open.keruyun.com";

    /**
     * 获取门店token
     */
    public static final String GET_TOKEN = API_URL + "/open/v1/token/get";

    /**
     * 查询门店菜品分类
     */
    public static final String CATEGORY = API_URL + "/open/v1/cater/dish/category";

    /**
     * 查询门店菜品分类及父级分类
     */
    public static final String CATEGORYALL = API_URL + "/open/v1/cater/dish/categoryAll";

    /**
     * 查询门店菜单（不可查询套餐）
     */
    public static final String DISHMENU = API_URL + "/open/v1/cater/dish/dishMenu";

    /**
     * 根据门店ID查询门店菜品
     */
    public static final String DISHMENUBYIDS = API_URL + "/open/v1/cater/dish/dishMenuByIds";

    /**
     * 客如云批量修改门店菜品信息
     */
    public static final String BATCHEDIT = API_URL + "open/v1/cater/dish/batchEdit";

    /**
     * 第三方合作方调用此接口，创建外卖订单（该接口中的金额全部是分为单位）
     */
    public static final String CREATE_ORDER = API_URL + "/open/v1/takeout/order/create";

    /**
     * 第三方合作方调用此接口，查询订单状态
     */
    public static final String GET_ORDER_STATUS = API_URL + "/open/v1/takeout/order/status/get";

    /**
     * 合作方取消订单, 用此接口推送订单取消状态
     */
    public static final String CANCEL_ORDER = API_URL + "/open/v1/takeout/order/cancel";

    /**
     * 第三方合作方调用此接口，申请退款,需要商户确认,在线付款的订单调用此接口
     */
    public static final String APPLYREFUND_ORDER = API_URL + "/open/v1/takeout/order/applyRefund";

    /**
     * 合作方平台配送时, 调用此接口推送订单配送状态, 不支持商家自配送的订单调用此接口
     */
    public static final String PUSH_DELIVERY_STATUS = API_URL + "/open/v1/takeout/order/delivery/status/push";

    /**
     * 第三方合作方调用此接口，推送配送状态给客如云(商家自配送状态推送)
     */
    public static final String PUSH_DELIVERY_STATUS_SELF = API_URL + "/open/v1/delivery/status/push";


}
