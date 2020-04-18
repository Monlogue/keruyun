package com.pers.keruyun.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.pers.keruyun.constant.RequestConstant;
import com.pers.keruyun.service.CommonService;
import com.pers.keruyun.service.ShopService;
import com.pers.keruyun.util.HttpRequestUtil;
import com.pers.keruyun.util.JsonUtil;

import java.util.Map;

public class ShopServiceImpl extends CommonService implements ShopService {
    @Override
    public Map shoplist(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.SHOPLIST, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map shopdetails(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.SHOPDETAILS, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map fetchTables(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.FETCHTABLES, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map fetchPeriod(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.FETCHPERIOD, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map fetchAppShops(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.FETCHAPPSHOPS, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map queryStatus(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.QUERYSTATUS, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map modifyStatus(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.MODIFYSTATUS, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map payWayQuery(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.PAYWAY_QUERY, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map surchargeQuery(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.SURCHARGE_QUERY, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map accessToken(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.ACCESSTOKEN, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map getUserInfo(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.GETUSERINFO, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }
}
