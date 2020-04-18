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
     * 查询菜单分类下的菜单信息
     */
    public static final String DISHNEW = API_URL + "/open/v1/cater/dish/dishNew";

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
     * 第三方合作方调用此接口，创建堂食订单（该接口中的金额全部是分为单位）
     */
    public static final String CREATE_SNACK_ORDER = API_URL + "/open/v1/snack/order/create";

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


    public static final String SCANCODE = API_URL + "/open/v1/wallet/scanCode";

    public static final String SHOWCODE = API_URL + "/open/v1/wallet/showCode";

    public static final String PAYQUERY = API_URL + "/open/v1/wallet/payQuery";

    public static final String REFUNDAPPLY = API_URL + "/open/v1/wallet/refundApply";

    public static final String REFUNDQUERY = API_URL + "/open/v1/wallet/refundQuery";

    public static final String CREATECUSTOMER = API_URL + "/open/v1/crm/createCustomer";

    public static final String CREATEORUPGRADEMEMBER = API_URL + "/open/v1/crm/createOrUpgradeMember";

    public static final String GETCUSTOMERDETAILBYID = API_URL + "/open/v1/crm/getCustomerDetailById";

    public static final String UPDATECUSTOMERINFO = API_URL + "/open/v1/crm/updateCustomerInfo";

    public static final String GETCUSTOMERCARDS = API_URL + "/open/v1/crm/getCustomerCards";

    public static final String GETMEMBERLEVELLIST = API_URL + "/open/v1/member/getMemberLevelList";

    public static final String UPDATELEVEL = API_URL + "/open/v1/member/updateLevel";

    public static final String LOGIN = API_URL + "/open/v1/crm/login";

    public static final String AUTOLOGIN = API_URL + "/open/v1/crm/autoLogin";

    public static final String GENERATETOKEN = API_URL + "/open/v1/crm/member/generateToken";

    public static final String FETCHSTOREDETAIL = API_URL + "/open/v1/crm/fetchStoreDetail";

    public static final String RECHARGE = API_URL + "/open/v1/crm/member/recharge";

    public static final String COMMERCIALTOTALSTORE = API_URL + "/open/v1/crm/commercialTotalStore";

    public static final String ADD_POINT = API_URL + "/open/v1/crm/point/add";

    public static final String CUT_POINT = API_URL + "/open/v1/crm/point/cut";

    public static final String FETCHCOUPINSTANCELIST = API_URL + "/open/v1/crm/fetchCoupInstanceList";

    public static final String FETCHCOUPINSTANCEDETAIL = API_URL + "/open/v1/crm/fetchCoupInstanceDetail";

    public static final String COUPON_PAGE = API_URL + "/open/v1/crm/coupon/page";

    public static final String MANUALSEND = API_URL + "/open/v1/crm/coupon/manualSend";

    public static final String COUPON_VALIDATE = API_URL + "/open/v1/crm/coupon/validate";

    public static final String FETCHRULES = API_URL + "/open/v1/crm/fetchRules";

    //shop相关

    public static final String SHOPLIST = API_URL + "/open/v1/shop/shoplist";

    public static final String SHOPDETAILS = API_URL + "/open/v1/shop/shopdetails";

    public static final String FETCHTABLES = API_URL + "/open/v1/table/fetchTables";

    public static final String FETCHPERIOD = API_URL + "/open/v1/shop/fetchPeriod";

    public static final String FETCHAPPSHOPS = API_URL + "/open/v1/shop/fetchAppShops";

    public static final String QUERYSTATUS = API_URL + "/open/v1/shop/queryStatus";

    public static final String MODIFYSTATUS = API_URL + "/open/v1/shop/modifyStatus";

    public static final String PAYWAY_QUERY = API_URL + "/open/v1/pay/payWay/query";

    public static final String SURCHARGE_QUERY = API_URL + "/open/v1/shop/surcharge/query";

    public static final String ACCESSTOKEN = API_URL + "/oauth2/accessToken";

    public static final String GETUSERINFO = API_URL + "/oauth2/getUserInfo";

    //供应链相关

    public static final String TRANSACTIONVOUCHER = API_URL + "/open/v1/supplyChain/transactionVoucher";

    public static final String FINDINVENTORY = API_URL + "/open/v1/supplyChain/warehouse/findInventory";

    public static final String FETCHACCOUNTDEPOSITLIST = API_URL + "/open/v1/supplyChain/finance/fetchAccountDepositList";

    public static final String FINDINVENTORYFORDISH = API_URL + "/open/v1/cater/dish/findInventoryForDish";

    public static final String FETCHWAREHOUSELIST = API_URL + "/open/v1/supplyChain/warehouse/fetchWarehouseList";

    public static final String FETCHSUPPLIERCATELIST = API_URL + "/open/v1/supplyChain/supplier/fetchSupplierCateList";

    public static final String FETCHSUPPLIERLIST = API_URL + "/open/v1/supplyChain/supplier/fetchSupplierList";

    public static final String FINDSKU = API_URL + "/open/v1/supplyChain/warehouse/findSku";

    public static final String SKUTYPE = API_URL + "/open/v1/supplyChain/sku/skuType";

    public static final String FETCHFINANCERECORDLIST = API_URL + "/open/v1/supplyChain/finance/fetchFinanceRecordList";

    public static final String OUTBOUNDDETAIL = API_URL + "/open/v1/supplyChain/outboundDetail";

    public static final String PURCHASEASN = API_URL + "/open/v1/supplyChain/purchase/purchaseAsn";

    public static final String PURCHASEASNDETAIL = API_URL + "/open/v1/supplyChain/purchase/purchaseAsnDetail";

    public static final String PURCHASEORDER = API_URL + "/open/v1/supplyChain/purchaseOrder";

    public static final String RETURNQUERY = API_URL + "/open/v1/supplyChain/purchase/returnQuery";

    public static final String RETURNQUERYDETAIL = API_URL + "/open/v1/supplyChain/purchase/returnQueryDetail";

    public static final String QUERYDELIVERYLIST = API_URL + "/open/v1/supplyChain/queryDeliveryList";

    public static final String BACKSTORAGEDETAIL = API_URL + "/open/v1/supplyChain/backStorageDetail";

    public static final String INBOUNDPAGE = API_URL + "/open/v1/supplyChain/inboundPage";

    public static final String INBOUNDDETAIL = API_URL + "/open/v1/supplyChain/inboundDetail";

    public static final String OUTBOUNDQUERY = API_URL + "/open/v1/supplyChain/outBoundQuery";

    public static final String OUTBOUNDDETAILQUERY = API_URL + "/open/v1/supplyChain/outBoundDetailQuery";

    public static final String PAGEQUERY = API_URL + "/open/v1/supplyChain/allocation/pageQuery";

    public static final String ALLOCATION_DETAIL = API_URL + "/open/v1/supplyChain/allocation/detail";

    public static final String INVENTORY_PAGEQUERY= API_URL + "/open/v1/supplyChain/inventory/pageQuery";

    public static final String INVENTORY_DETAIL = API_URL + "/open/v1/supplyChain/inventory/detail";

    public static final String RETURN_PAGEQUERY = API_URL + "/open/v1/supplyChain/return/pageQuery";

    public static final String QUERYDELIVERYDETAIL = API_URL + "/open/v1/supplyChain/queryDeliveryDetail";

    public static final String STOCK_OUT = API_URL + "/open/v1/supplyChain/stock/out";

    public static final String STOCK_IN = API_URL + "/open/v1/supplyChain/stock/in";

    public static final String RECEIVEPAGEQUERY = API_URL + "/open/v1/supplyChain/receivePageQuery";

    public static final String RECEIVEDETAIL = API_URL + "/open/v1/supplyChain/receiveDetail";

    public static final String SCRAPPAGEQUERY = API_URL + "/open/v1/supplyChain/scrapPageQuery";

    public static final String SCRAPDETAIL = API_URL + "/open/v1/supplyChain/scrapDetail";

    public static final String BACKSTORAGEPAGEQUERY = API_URL + "/open/v1/supplyChain/backStoragePageQuery";

    public static final String RECEIPT_SAVE = API_URL + "/open/v1/supplyChain/receipt/save";


}
