package com.mmpmr.persistence;

import com.mmpmr.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

    public User findOne(int id) {
        return USERS.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }

    public User save(User newUser) {
        if (newUser.getId() == null) {
            newUser.setId(USERS.size() + 1);
        }
        USERS.add(newUser);
        return newUser;
    }

    public User deleteById(int id) {
        for (Iterator<User> iterator = USERS.iterator(); iterator.hasNext();) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }


}
