package com.java.springboot.simple.advice.exeption;

import com.java.springboot.simple.web.code.Code;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Error 커스텀 객체
 * @author : JiYoung
 **/

@EqualsAndHashCode(callSuper = true)
@Getter
public class CustomException extends RuntimeException {

    private String code;
    private String msg;

    public CustomException(Code code) {
        super();
        this.code = code.getCode();
        this.msg = code.getMsg();
    }

}
