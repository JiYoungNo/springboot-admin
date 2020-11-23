package com.java.springboot.simple.confg;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * thymeleaf 레이아웃 설정 객체
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
