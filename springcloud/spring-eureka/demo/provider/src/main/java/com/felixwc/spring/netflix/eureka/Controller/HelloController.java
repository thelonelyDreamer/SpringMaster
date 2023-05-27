package com.felixwc.spring.netflix.eureka.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.bouncycastle.cert.ocsp.Req;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/5/26--@20:58
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String string(HttpServletRequest request){
        return "hello"+request.getLocalPort();
    }
}
