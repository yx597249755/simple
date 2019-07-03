package com.lei.dao;

import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao {
    @Override
    public String login() {
        return "dao";
    }
}
