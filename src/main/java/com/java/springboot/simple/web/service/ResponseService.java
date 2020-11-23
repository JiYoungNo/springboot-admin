package com.java.springboot.simple.web.service;

import com.java.springboot.simple.web.response.CommonResponse;
import com.java.springboot.simple.web.response.ListResponse;
import com.java.springboot.simple.web.response.SingleResponse;
import com.java.springboot.simple.web.code.Code;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 응답 객체 처리 서비스
 * 공통 서비스
 * @author : JiYoung
**/

@Service
public class ResponseService {

    // 단일건 결과를 처리하는 메소드
    public <T> SingleResponse<T> getSingleResponse(T data) {
        SingleResponse<T> response = new SingleResponse<>();
        response.setData(data);
        setSuccessResponse(response);
        return response;
    }

    // 다중건 결과를 처리하는 메소드
    public <T> ListResponse<T> getListResponse(List<T> list) {
        ListResponse<T> response = new ListResponse<>();
        response.setList(list);
        setSuccessResponse(response);
        return response;
    }

    // 성공 결과만 처리하는 메소드
    public CommonResponse getSuccessResponse() {
        CommonResponse response = new CommonResponse();
        setSuccessResponse(response);
        return response;
    }
    // 실패 결과만 처리하는 메소드
    public CommonResponse getFailResponse(String code, String msg) {
        CommonResponse response = new CommonResponse();
        response.setResultCode(code);
        response.setResultMsg(msg);
        return response;
    }

    // 실패 결과만 처리하는 메소드
    public CommonResponse getUnknownFailResponse() {
        CommonResponse response = new CommonResponse();
        response.setResultCode(Code.UNKNOWN_SERVICE_ERROR.getCode());
        response.setResultMsg(Code.UNKNOWN_SERVICE_ERROR.getMsg());
        return response;
    }

    // 결과 모델에 api 요청 성공 데이터를 세팅해주는 메소드
    private void setSuccessResponse(CommonResponse response) {
        response.setResultCode(Code.SUCCESS.getCode());
        response.setResultMsg(Code.SUCCESS.getMsg());
    }

}
