package org.example.controller;

import com.alibaba.fastjson2.JSON;
import jakarta.validation.Valid;
import org.example.except.EX1;
import org.example.except.EX2;
import org.example.pojo.MyObject;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/5/28--@11:34
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/str/{str}")
    public String num(@PathVariable String str) throws Exception {
        if ("1".equals(str)) {
            throw new EX1();
        } else if ("2".equals(str)) {
            throw new EX2();
        }
        return str;
    }

    @PostMapping("/my")
    public String my(@Valid @Validated @RequestBody MyObject myObject, BindingResult result) {
        if (result.hasErrors()) {
            HashMap<Object, Object> map = new HashMap<>();
            result.getFieldErrors().forEach(
                    e -> {
                        System.out.println(e.getField());
                    }
            );
            return JSON.toJSONString(map);
        }

        return "";
    }
}
