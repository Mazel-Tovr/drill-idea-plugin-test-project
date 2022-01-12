package com.epam.buisnes;

import com.epam.model.*;

public interface UserService {

    boolean validateUser(User user);

    User registerUser(String name, String password);

    boolean removeUser(String id);

}
