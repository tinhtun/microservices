package com.mmpmr.persistence;

import com.mmpmr.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    private static final List<User> USERS = new ArrayList<>();
    static {
        USERS.add(new User(1, "Sheldon", new Date()));
        USERS.add(new User(2, "Raj", new Date()));
        USERS.add(new User(3, "Penny", new Date()));
    }

    public List<User> findAll() {
        return USERS;
    }



}
