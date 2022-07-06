package com.cot.bankingappmvc.mapper;

import com.cot.bankingappmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserMapper implements RowMapper<User> {

    User user;

    @Autowired
    public UserMapper(User user) {
        this.user = user;
    }


    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        user.setId(rs.getLong("id"));
        user.setName(rs.getString("name"));
        user.setIndustry(rs.getString("industry"));
        user.setResidency(rs.getString("residency"));
        user.setLogin(rs.getString("login"));
        user.setPassword(rs.getString("password"));
        return user;
    }
}
