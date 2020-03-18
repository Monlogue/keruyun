package com.pers.keruyun.util;


import com.alibaba.fastjson.JSON;
import com.pers.keruyun.model.request.CommonRequest;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 请求body构造器
 */
public class ParamBuilder {

    public static Map<String, String> convertToMap(CommonRequest request) {
        Map<String, String> map = new HashMap<String, String>();
        if (request == null) {
            return map;
        }

        putIfNotEmpty(map, "appKey", request.getAppKey());
        putIfNotEmpty(map, "shopIdenty", request.getShopIdenty());
        putIfNotEmpty(map, "sign", request.getSign());
        putIfNotEmpty(map, "timestamp", request.getTimestamp());
        putIfNotEmpty(map, "token", request.getToken());
        putIfNotEmpty(map, "version", request.getVersion());

        return map;
    }


    private static void putIfNotEmpty(Map<String, String> map, String key, String value) {
        if (StringUtils.isNotEmpty(value) && !"null".equals(value)) {
            map.put(key, value);
        }
    }

}
