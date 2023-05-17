package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/5/17--@6:43
 */

@Component
public class SelfBean {
    private SelfBean selfBean;

    @Autowired
    public SelfBean setSelfBean(SelfBean selfBean) {
        this.selfBean = selfBean;
        return this;
    }

}

