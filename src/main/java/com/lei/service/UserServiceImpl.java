package com.lei.service;

import org.springframework.stereotype.Repository;

@Repository
public class UserServiceImpl implements UserService {
    @Override
    public String login() {
        return "service";
    }
}
