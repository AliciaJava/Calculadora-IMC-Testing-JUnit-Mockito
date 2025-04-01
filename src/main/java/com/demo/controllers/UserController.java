package com.demo.controllers;

import com.demo.models.User;
import com.demo.services.UserService;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("api/user")
public class UserController {

    private UserService service;
    public UserController(UserService service) {
        this.service = service;
    }


    @GetMapping("/{id}")
    User get(@RequestHeader HttpHeaders headers, @PathVariable String id) {
        return service.get(id);
    }

    void remove(@RequestHeader HttpHeaders headers, @PathVariable String id) {
        service.remove(id);
    }

    void removeMany(@RequestHeader HttpHeaders headers, @PathVariable String[] ids) {
        Arrays.stream(ids).forEach(id -> service.remove(id));
    }
}
