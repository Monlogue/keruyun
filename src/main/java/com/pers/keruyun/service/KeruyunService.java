package com.pers.keruyun.service;

import java.util.Map;

/**
 * 菜品分类、菜品、订单、配送、支付
 */
public interface KeruyunService {

    Map getCategory() throws Exception;

    Map getCategoryAll() throws Exception;

    Map getDishMenu(Map map) throws Exception;

    Map getDishNew(Map map) throws Exception;

    Map getDishMenuByIds(Map map) throws Exception;

    Map batchEditDish(Map map) throws Exception;

    Map create(Map map) throws Exception;

    Map createSnack(Map map) throws Exception;

    Map getOrderStatus(Map map) throws Exception;

    Map cancelOrder(Map map) throws Exception;

    Map applyRefundOrder(Map map) throws Exception;

    Map pushDeliveryStatus(Map map) throws Exception;

    Map pushDeliveryStatusSelf(Map map) throws Exception;

    /**
     * 商户通过该接口生成支付二维码，顾客使用微信/支付宝扫描该二维码，然后完成支付
     *
     * @param map
     * @return
     * @throws Exception
     */
    Map scanCode(Map map) throws Exception;

    /**
     * 顾客出示付款条形码(微信/支付宝)，商户使用扫码设备扫描条形码进行收款
     *
     * @param map
     * @return
     * @throws Exception
     */
    Map showCode(Map map) throws Exception;

    /**
     * 根据支付单号，查询支付状态
     *
     * @param map
     * @return
     * @throws Exception
     */
    Map payQuery(Map map) throws Exception;

    /**
     * 商户通过该接口发起退款申请
     *
     * @param map
     * @return
     * @throws Exception
     */
    Map refundApply(Map map) throws Exception;

    /**
     * 商户通过该接口发起查询退款单状态
     *
     * @param map
     * @return
     * @throws Exception
     */
    Map refundQuery(Map map) throws Exception;


}
