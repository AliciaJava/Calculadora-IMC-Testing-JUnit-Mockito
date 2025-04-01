package com.demo.services;

import org.springframework.stereotype.Service;

import com.demo.models.User;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User get(String id) {
        return null;
    }

    @Override
    public void remove(String id) {

    }
}
