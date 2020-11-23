package com.java.springboot.simple.advice;


import com.java.springboot.simple.advice.exeption.CustomException;
import com.java.springboot.simple.web.response.CommonResponse;
import com.java.springboot.simple.web.service.ResponseService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Exception 공통처리 Advice
 * @author : JiYoung
**/

@RequiredArgsConstructor
@RestControllerAdvice
public class ExceptionAdvice {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ResponseService responseService;

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    protected CommonResponse unknownServerException(Exception e) {
        logger.error("unknownServerException:", e);
        return responseService.getUnknownFailResponse();
    }

    @ExceptionHandler(CustomException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    protected CommonResponse customException(CustomException e) {
        logger.error("customException:", e);
        logger.error("customException reponse: [code: {}, msg: {}]", e.getCode(), e.getMsg());
        return responseService.getFailResponse(e.getCode(),e.getMsg());
    }
}