package com.java.springboot.simple.confg;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 레이아웃 설정 빈 등록
 * @date : 2020-11-16 오후 2:42
 * @author : JiYoung
**/

@Configuration
public class LayoutConfig {

    //thymeleaf layout
    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }
}
