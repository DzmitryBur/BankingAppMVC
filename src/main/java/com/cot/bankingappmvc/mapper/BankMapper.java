package com.cot.bankingappmvc.mapper;

import com.cot.bankingappmvc.model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class BankMapper implements RowMapper<Bank> {

    Bank bank;

    @Autowired
    public BankMapper(Bank bank) {
        this.bank = bank;
    }


    @Override
    public Bank mapRow(ResultSet rs, int rowNum) throws SQLException {
        bank.setId(rs.getLong("id"));
        bank.setName(rs.getString("name"));
        bank.setSwift(rs.getString("swift"));
        return bank;
    }
}