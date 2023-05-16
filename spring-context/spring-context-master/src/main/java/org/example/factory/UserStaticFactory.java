package org.example.factory;

import org.example.pojo.User;

public class UserStaticFactory {
    public static User create(){
        return new User();
    }
}
