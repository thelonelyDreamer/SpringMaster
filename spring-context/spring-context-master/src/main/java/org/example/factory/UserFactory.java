package org.example.factory;

import org.example.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/5/16--@16:43
 */
public class UserFactory implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
