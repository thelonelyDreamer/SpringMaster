package org.example.controller.advice;

import org.example.except.EX1;
import org.example.except.EX2;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/5/28--@11:32
 */
@RestControllerAdvice
public class GlobalAdvice2 {
    @ExceptionHandler({EX2.class})
    public String ex1(Throwable e){
        return e.getMessage();
    }
}
