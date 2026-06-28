package com.husnain.XMLBasedConfig;

import java.util.List;

public class UserService {
    private final List<String> usersNames;
    public UserService(List<String> usersNames) {
        this.usersNames = usersNames;
    }
    public void printUsers() {
        System.out.println(usersNames);
    }
}
