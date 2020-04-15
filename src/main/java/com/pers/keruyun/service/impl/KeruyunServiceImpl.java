package com.pers.keruyun.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.pers.keruyun.config.KeruyunConfig;
import com.pers.keruyun.constant.RequestConstant;
import com.pers.keruyun.service.CommonService;
import com.pers.keruyun.service.KeruyunService;
import com.pers.keruyun.util.HttpClient;
import com.pers.keruyun.util.HttpRequestUtil;
import com.pers.keruyun.util.JsonUtil;
import com.pers.keruyun.util.SignHelper;

import java.util.Map;


public class KeruyunServiceImpl extends CommonService implements KeruyunService {


    /**
     * 查询菜品分类
     *
     * @return
     * @throws Exception
     */
    @Override
    public Map getCategory() throws Exception {
        String responseString = HttpClient.post(RequestConstant.CATEGORY, keruyunConfig.getMap());
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    /**
     * 查询菜品详细分类（所有大分类）
     *
     * @return
     * @throws Exception
     */
    @Override
    public Map getCategoryAll() throws Exception {
        String responseString = HttpClient.post(RequestConstant.CATEGORYALL, keruyunConfig.getMap());
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    /**
     * 分页查询菜品信息
     *
     * @param map
     * @return
     * @throws Exception
     */
    @Override
    public Map getDishMenu(Map map) throws Exception {
        String url = JsonUtil.splitUrl(RequestConstant.DISHMENU, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map getDishNew(Map map) throws Exception {
        String url = JsonUtil.splitUrl(RequestConstant.DISHNEW, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        //String responseString = HttpClient.post(RequestConstant.DISHNEW, map);
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    /**
     * 根据菜品ID查询 ids
     *
     * @param map
     * @return
     * @throws Exception
     */
    @Override
    public Map getDishMenuByIds(Map map) throws Exception {
        String url = JsonUtil.splitUrl(RequestConstant.DISHMENUBYIDS, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    /**
     * 批量修改菜品信息
     *
     * @param map
     * @return
     * @throws Exception
     */
    @Override
    public Map batchEditDish(Map map) throws Exception {
        String url = JsonUtil.splitUrl(RequestConstant.BATCHEDIT, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map create(Map map) throws Exception {
        String url = JsonUtil.splitUrl(RequestConstant.CREATE_ORDER, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map createSnack(Map map) throws Exception {
        String url = JsonUtil.splitUrl(RequestConstant.CREATE_SNACK_ORDER, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map getOrderStatus(Map map) throws Exception {
        String url = JsonUtil.splitUrl(RequestConstant.GET_ORDER_STATUS, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map cancelOrder(Map map) throws Exception {
        String url = JsonUtil.splitUrl(RequestConstant.CANCEL_ORDER, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map applyRefundOrder(Map map) throws Exception {
        String url = JsonUtil.splitUrl(RequestConstant.APPLYREFUND_ORDER, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map pushDeliveryStatus(Map map) throws Exception {
        String url = JsonUtil.splitUrl(RequestConstant.PUSH_DELIVERY_STATUS, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map pushDeliveryStatusSelf(Map map) throws Exception {
        String url = JsonUtil.splitUrl(RequestConstant.PUSH_DELIVERY_STATUS_SELF, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map scanCode(Map map) throws Exception {
        return null;
    }

    @Override
    public Map showCode(Map map) throws Exception {
        return null;
    }

    @Override
    public Map payQuery(Map map) throws Exception {
        return null;
    }

    @Override
    public Map refundApply(Map map) throws Exception {
        return null;
    }

    @Override
    public Map refundQuery(Map map) throws Exception {
        return null;
    }


}
