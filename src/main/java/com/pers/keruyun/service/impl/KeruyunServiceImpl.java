package com.pers.keruyun.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.pers.keruyun.config.KeruyunConfig;
import com.pers.keruyun.constant.RequestConstant;
import com.pers.keruyun.model.response.CommonResponse;
import com.pers.keruyun.service.KeruyunService;
import com.pers.keruyun.util.HttpClient;
import com.pers.keruyun.util.HttpRequestUtil;
import com.pers.keruyun.util.SignHelper;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class KeruyunServiceImpl implements KeruyunService {

    private KeruyunConfig keruyunConfig;

    public void setKeruyunConfig(KeruyunConfig keruyunConfig) {
        SignHelper.signForToken(keruyunConfig);
        this.keruyunConfig = keruyunConfig;
        try {
            keruyunConfig.setToken(getToken());//获取token
        } catch (Exception e) {
            e.printStackTrace();
        }
        SignHelper.setSign(keruyunConfig);//获取sign
        this.keruyunConfig = keruyunConfig;

    }


    private String getToken() throws Exception {
        String responseString = HttpRequestUtil.get(RequestConstant.GET_TOKEN + "?appKey=" + keruyunConfig.getAppKey() + "&shopIdenty=" + keruyunConfig.getShopIdenty() + "&version=" + keruyunConfig.getVersion() + "&timestamp=" + keruyunConfig.getTimestamp() + "&sign=" + keruyunConfig.getSign());
        //String responseString = HttpClient.post(RequestConstant.GET_TOKEN, keruyunConfig.getMap());
        if (responseString != null) {
            JSONObject jsonObject = JSONObject.parseObject(responseString);
            JSONObject result = JSONObject.parseObject(jsonObject.get("result").toString());
            return result.get("token").toString();
        }
        return null;
    }

    private String splitUrl(String url, TreeMap maps) {
        Iterator iterator = maps.keySet().iterator();
        int countLown = 0;
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            if (countLown == 0) {
                url += "?" + key + "=" + maps.get(key);
            } else {
                url += "&" + key + "=" + maps.get(key);
            }
            countLown++;

        }
        return url;
    }

    @Override
    public CommonResponse getCategory(Map map) throws Exception {
        map.putAll(keruyunConfig.getMap());
        String responseString = HttpClient.post(RequestConstant.CATEGORY, map);
        if (responseString != null) {
            CommonResponse commonResponse = JSONObject.parseObject(responseString, CommonResponse.class);
            return commonResponse;
        }
        return null;
    }

    @Override
    public CommonResponse getCategoryAll(Map map) throws Exception {
        map.putAll(keruyunConfig.getMap());
        String responseString = HttpClient.post(RequestConstant.CATEGORYALL, map);
        if (responseString != null) {
            CommonResponse commonResponse = JSONObject.parseObject(responseString, CommonResponse.class);
            return commonResponse;
        }
        return null;
    }

    @Override
    public CommonResponse getDishMenu(Map map) throws Exception {
        map.putAll(keruyunConfig.getMap());
        String responseString = HttpClient.post(RequestConstant.DISHMENU, map);
        if (responseString != null) {
            CommonResponse commonResponse = JSONObject.parseObject(responseString, CommonResponse.class);
            return commonResponse;
        }
        return null;
    }

    @Override
    public CommonResponse getDishMenuByIds(Map map) throws Exception {
        map.putAll(keruyunConfig.getMap());
        String responseString = HttpClient.post(RequestConstant.DISHMENUBYIDS, map);
        if (responseString != null) {
            CommonResponse commonResponse = JSONObject.parseObject(responseString, CommonResponse.class);
            return commonResponse;
        }
        return null;
    }

    @Override
    public CommonResponse batchEditDish(Map map) throws Exception {
        map.putAll(keruyunConfig.getMap());
        String responseString = HttpClient.post(RequestConstant.BATCHEDIT, map);
        if (responseString != null) {
            CommonResponse commonResponse = JSONObject.parseObject(responseString, CommonResponse.class);
            return commonResponse;
        }
        return null;
    }

    @Override
    public CommonResponse create(Map map) throws Exception {
        map.putAll(keruyunConfig.getMap());
        String responseString = HttpClient.post(RequestConstant.CREATE_ORDER, map);
        if (responseString != null) {
            CommonResponse commonResponse = JSONObject.parseObject(responseString, CommonResponse.class);
            return commonResponse;
        }
        return null;
    }

    @Override
    public CommonResponse getOrderStatus(Map map) throws Exception {
        map.putAll(keruyunConfig.getMap());
        String responseString = HttpClient.post(RequestConstant.GET_ORDER_STATUS, map);
        if (responseString != null) {
            CommonResponse commonResponse = JSONObject.parseObject(responseString, CommonResponse.class);
            return commonResponse;
        }
        return null;
    }

    @Override
    public CommonResponse cancelOrder(Map map) throws Exception {
        map.putAll(keruyunConfig.getMap());
        String responseString = HttpClient.post(RequestConstant.CANCEL_ORDER, map);
        if (responseString != null) {
            CommonResponse commonResponse = JSONObject.parseObject(responseString, CommonResponse.class);
            return commonResponse;
        }
        return null;
    }

    @Override
    public CommonResponse applyRefundOrder(Map map) throws Exception {
        map.putAll(keruyunConfig.getMap());
        String responseString = HttpClient.post(RequestConstant.APPLYREFUND_ORDER, map);
        if (responseString != null) {
            CommonResponse commonResponse = JSONObject.parseObject(responseString, CommonResponse.class);
            return commonResponse;
        }
        return null;
    }

    @Override
    public CommonResponse pushDeliveryStatus(Map map) throws Exception {
        map.putAll(keruyunConfig.getMap());
        String responseString = HttpClient.post(RequestConstant.PUSH_DELIVERY_STATUS, map);
        if (responseString != null) {
            CommonResponse commonResponse = JSONObject.parseObject(responseString, CommonResponse.class);
            return commonResponse;
        }
        return null;
    }

    @Override
    public CommonResponse pushDeliveryStatusSelf(Map map) throws Exception {
        map.putAll(keruyunConfig.getMap());
        String responseString = HttpClient.post(RequestConstant.PUSH_DELIVERY_STATUS_SELF, map);
        if (responseString != null) {
            CommonResponse commonResponse = JSONObject.parseObject(responseString, CommonResponse.class);
            return commonResponse;
        }
        return null;
    }


}
