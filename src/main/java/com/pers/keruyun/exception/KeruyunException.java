package com.pers.keruyun.exception;

import com.pers.keruyun.enums.KeruyunResultEnum;

public class KeruyunException extends RuntimeException {

    private Integer code;

    public KeruyunException(KeruyunResultEnum resultEnum) {
        super(resultEnum.getMsg());
        code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }
}
