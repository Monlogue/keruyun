package com.pers.keruyun.model.request;

import lombok.Data;

@Data
public class CommonRequest {

    /**
     * 开发者申请服务客如云分配的appKey
     */
     String appKey;
    /**
     * 客如云门店id
     */
     String shopIdenty;
    /**
     * 版本,默认1.0
     */
     String timestamp;
    /**
     * 时间戳,单位:秒,时间戳校验签名,开放平台校验签名时用此参数和服务器当前时间戳对比不能大于300秒，我方服务器使用阿里云授时中心
     */
     String version;
    /**
     * 门店token
     */
     String token;
    /**
     * 签名，64位长度的字符串详见签名规则
     */
     String sign;

}
