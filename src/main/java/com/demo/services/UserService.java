package com.demo.services;

import com.demo.models.User;

public interface UserService {
    User get(String id);

    void remove(String id);
}
