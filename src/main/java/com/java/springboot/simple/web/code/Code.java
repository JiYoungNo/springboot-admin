package com.java.springboot.simple.web.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 공통 코드 정의 enum
 * @author : JiYoung
**/

@AllArgsConstructor
@Getter
public enum Code {
    SUCCESS("0000", "성공"),
    UNKNOWN_SERVICE_ERROR("9999", "서비스 오류[정의 되지 않은 오류, 관리자에게 문의요망]");

    String code;
    String msg;
}
