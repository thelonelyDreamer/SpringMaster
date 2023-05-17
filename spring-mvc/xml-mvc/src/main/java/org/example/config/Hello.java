package org.example.config;

import org.example.interceptor.CustomHandlerInterceptorImpl;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/5/17--@9:52
 */
public class Hello implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomHandlerInterceptorImpl())
                .order(1)
                .addPathPatterns("/**")
                .excludePathPatterns("/1")
                .pathMatcher(new AntPathMatcher());
    }
}
