package com.java.springboot.simple.web;

import com.java.springboot.simple.advice.exeption.CustomException;
import com.java.springboot.simple.web.code.Code;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/board")
    public String board() {
        return "admin/home/board";
    }

    @GetMapping("/login")
    public String index() {
        return "admin/login/login";
    }
}
