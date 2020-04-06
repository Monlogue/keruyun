package com.pers.keruyun.service;

import java.util.Map;

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

}
