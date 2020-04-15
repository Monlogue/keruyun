package com.pers.keruyun.service;

import com.alibaba.fastjson.JSONObject;
import com.pers.keruyun.config.KeruyunConfig;
import com.pers.keruyun.constant.RequestConstant;
import com.pers.keruyun.util.HttpRequestUtil;
import com.pers.keruyun.util.SignHelper;

public class CommonService {
    public static KeruyunConfig keruyunConfig;

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
        if (responseString != null) {
            JSONObject jsonObject = JSONObject.parseObject(responseString);
            JSONObject result = JSONObject.parseObject(jsonObject.get("result").toString());
            return result.get("token").toString();
        }
        return null;
    }
}
