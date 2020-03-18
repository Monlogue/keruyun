package com.pers.keruyun.service;

import com.pers.keruyun.model.response.CommonResponse;

import java.util.Map;

public interface KeruyunService {

    CommonResponse getCategory(Map map) throws Exception;

    CommonResponse getCategoryAll(Map map) throws Exception;

    CommonResponse getDishMenu(Map map) throws Exception;

    CommonResponse getDishMenuByIds(Map map) throws Exception;

    CommonResponse batchEditDish(Map map) throws Exception;

    CommonResponse create(Map map) throws Exception;

    CommonResponse getOrderStatus(Map map) throws Exception;

    CommonResponse cancelOrder(Map map) throws Exception;

    CommonResponse applyRefundOrder(Map map) throws Exception;

    CommonResponse pushDeliveryStatus(Map map) throws Exception;

    CommonResponse pushDeliveryStatusSelf(Map map) throws Exception;

}
