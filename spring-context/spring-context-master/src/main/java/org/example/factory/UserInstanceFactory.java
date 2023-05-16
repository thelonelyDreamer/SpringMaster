package org.example.factory;


import org.example.pojo.User;

public class UserInstanceFactory {
    public User createUser() {
        return new User();
    }
}
