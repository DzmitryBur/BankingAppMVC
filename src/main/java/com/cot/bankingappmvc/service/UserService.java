package com.cot.bankingappmvc.service;


import com.cot.bankingappmvc.mapper.UserMapper;
import com.cot.bankingappmvc.model.User;
import com.cot.bankingappmvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

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
}


