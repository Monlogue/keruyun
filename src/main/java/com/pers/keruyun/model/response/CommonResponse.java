package com.pers.keruyun.model.response;

import lombok.Data;

@Data
public abstract class CommonResponse {
    /**
     * 返回编码
     */
    int code;
    /**
     * 	返回信息
     */
    String message;
    /**
     * 消息uuid
     */
    String messageUuid;

    /**
     * 返回响应数据，json对象或数组，可空
     */
    Object result;
}
