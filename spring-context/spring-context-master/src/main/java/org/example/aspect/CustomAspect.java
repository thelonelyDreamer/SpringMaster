package org.example.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/5/17--@4:39
 */
public class CustomAspect {
    private static final Logger log = LoggerFactory.getLogger(CustomAspect.class);

    public void before() throws Throwable {
        log.info("前置切点");
    }
}
