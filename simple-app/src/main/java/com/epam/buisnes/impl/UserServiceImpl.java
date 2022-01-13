package com.epam.buisnes.impl;

import com.epam.buisnes.*;
import com.epam.model.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    private final Set<User> users = new HashSet<>();

    @Override
    public boolean validateUser(User user) {
        return users.contains(user);
    }

    @Override
    public User registerUser(String name, String password) {
        User user = new User(name, name, password);
        System.out.println("Is user added " + validateUser(user));
        users.add(user);
        User user1 = new User();
        user1.setId(name);
        user1.setName(name);
        user1.setPassword(password);
        return user1;
    }


    @Override
    public boolean removeUser(String id) {
        return users.removeIf((User u) -> u.getId().equals(id));
    }
}
