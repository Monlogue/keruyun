package com.pers.keruyun.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.pers.keruyun.constant.RequestConstant;
import com.pers.keruyun.service.CommonService;
import com.pers.keruyun.service.MemberService;
import com.pers.keruyun.util.HttpRequestUtil;
import com.pers.keruyun.util.JsonUtil;

import java.util.Map;

/**
 * 用户相关
 */
public class MemberServiceImpl extends CommonService implements MemberService {
    @Override
    public Map createCustomer(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.CREATECUSTOMER, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map createOrUpgradeMember(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.CREATEORUPGRADEMEMBER, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map getCustomerDetailById(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.GETCUSTOMERDETAILBYID, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map updateCustomerInfo(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.UPDATECUSTOMERINFO, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map getCustomerCards(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.GETCUSTOMERCARDS, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map getMemberLevelList(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.GETMEMBERLEVELLIST, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map updateLevel(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.UPDATELEVEL, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map login(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.LOGIN, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map autoLogin(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.AUTOLOGIN, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map generateToken(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.GENERATETOKEN, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map fetchStoreDetail(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.FETCHSTOREDETAIL, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map recharge(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.RECHARGE, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map commercialTotalStore(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.COMMERCIALTOTALSTORE, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map addPoint(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.ADD_POINT, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map cutPoint(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.CUT_POINT, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map fetchCoupInstanceList(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.FETCHCOUPINSTANCELIST, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map fetchCoupInstanceDetail(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.FETCHCOUPINSTANCEDETAIL, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map couponPage(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.COUPON_PAGE, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map couponManualSend(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.MANUALSEND, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map couponValidate(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.COUPON_VALIDATE, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map fetchRules(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.FETCHRULES, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }
}
