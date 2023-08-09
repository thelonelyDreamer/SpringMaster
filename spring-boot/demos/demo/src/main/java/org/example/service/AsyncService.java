package org.example.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/6/1--@8:15
 */
@Service
public class AsyncService {

    @Async
    public void async1(){
        System.out.println("this is async1 in AsyncService");
    }

    @Async
    public Future<String> asyncWithReturn(){
        CompletableFuture.runAsync(()->{});
        return new AsyncResult<String>("asyncWithReturn()");
    }
}
