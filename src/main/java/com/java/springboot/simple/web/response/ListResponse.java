package com.java.springboot.simple.web.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 결과가 다중건인 api의 응답을 담는 모델
 * @author : JiYoung
**/

@EqualsAndHashCode(callSuper = true)
@Data
public class ListResponse<T> extends CommonResponse {
    private List<T> list;
}
