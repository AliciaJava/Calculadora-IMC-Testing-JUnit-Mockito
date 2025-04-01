package com.demo.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.demo.services.UserService;


public class UserServiceTest {

    @InjectMocks
    private UserService service;

    @SuppressWarnings("deprecation")
	@Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getUserTest() {
    }

}
