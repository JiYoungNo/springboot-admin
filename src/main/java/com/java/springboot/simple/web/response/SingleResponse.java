package com.java.springboot.simple.web.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 결과가 단일건인 api의 응답을 담는 모델
 * @author : JiYoung
**/

@EqualsAndHashCode(callSuper = true)
@Data
public class SingleResponse<T> extends CommonResponse {
    private T data;

}
