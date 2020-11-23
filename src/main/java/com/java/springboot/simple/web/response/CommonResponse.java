package com.java.springboot.simple.web.response;

import lombok.Data;

/**
 * 공통 응답
 * @author : JiYoung
**/

@Data
public class CommonResponse {

    private String resultCode;
    private String resultMsg;
}
