package org.example.factory;

import org.example.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserStaticFactory {
    private static final Logger log = LoggerFactory.getLogger(UserInstanceFactory.class);
    public static User create(){
        log.info("static");
        return new User();
    }
}
