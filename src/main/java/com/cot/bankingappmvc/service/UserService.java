package com.cot.bankingappmvc.service;


import com.cot.bankingappmvc.mapper.UserMapper;
import com.cot.bankingappmvc.model.User;
import com.cot.bankingappmvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserRepository {

    JdbcTemplate jdbcTemplate;
    UserMapper userMapper;

    @Autowired
    public UserService(JdbcTemplate jdbcTemplate, UserMapper userMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.userMapper = userMapper;
    }


    @Override
    public User getUserBuId(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE id= ?", userMapper, id);
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int addUser(String name, String industry, String residency) {
        return jdbcTemplate.update("INSERT INTO users(id,name,industry,residency) VALUES (DEFAULT ,?,?,?)", name, industry, residency);
    }

//


}


