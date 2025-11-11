package com.nggiabao2004.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/public/hello")
    public String publicHello() {
        return "Hi Spring from everyone";
    }

    @GetMapping("/user/hello")
    public String userHello() {
        return "Hi Spring from USER";
    }

    @GetMapping("/admin/hello")
    public String adminHello() {
        return "Hi Spring from ADMIN";
    }

//    @GetMapping("/csrf-token")
//    public CsrfToken getCsrfToken(HttpServletRequest request){
//        return (CsrfToken) request.getAttribute("_csrf");
//    }
}
