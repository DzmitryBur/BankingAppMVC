package com.cot.bankingappmvc.mapper;

import com.cot.bankingappmvc.model.Bank;
import com.cot.bankingappmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;


@Component
public class BankMapper implements RowMapper<Bank> {


    @Override
    public Bank mapRow(ResultSet rs, int rowNum) throws SQLException {
        Bank bank = new Bank();
        bank.setId(rs.getLong("id"));
        bank.setName(rs.getString("name"));
        bank.setSwift(rs.getString("swift"));
        return bank;
    }
}