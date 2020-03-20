package com.pers.keruyun.config;

import lombok.Data;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class KeruyunConfig {
    /**
     * 开发者申请服务客如云分配的appKey
     */
    private String appKey;
    /**
     * 开发者申请服务客如云分配的secretKey
     */
    private String secretKey;
    /**
     * 客如云门店id
     */
    private String shopIdenty;
    /**
     * 版本,默认1.0
     */
    private String timestamp;
    /**
     * 时间戳,单位:秒,时间戳校验签名,开放平台校验签名时用此参数和服务器当前时间戳对比不能大于300秒，我方服务器使用阿里云授时中心
     */
    private String version;
    /**
     * 门店token
     */
    private String token;
    /**
     * 签名，64位长度的字符串详见签名规则
     */
    private String sign;

    public Map getMap() {
        Map map = new HashMap();
        map.put("appKey", appKey);
        map.put("secretKey", secretKey);
        map.put("shopIdenty", shopIdenty);
        map.put("version", version);
        map.put("timestamp", timestamp);
        map.put("token", token);
        map.put("sign", sign);
        return map;
    }

    public LinkedHashMap getCommonMap() {
        LinkedHashMap map = new LinkedHashMap();
        map.put("appKey", appKey);
        map.put("shopIdenty", shopIdenty);
        map.put("version", version);
        map.put("timestamp", timestamp);
        map.put("sign", sign);
        return map;
    }

}
