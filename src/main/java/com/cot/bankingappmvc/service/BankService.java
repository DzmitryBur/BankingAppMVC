package com.cot.bankingappmvc.service;


import com.cot.bankingappmvc.mapper.BankMapper;
import com.cot.bankingappmvc.model.Bank;
import com.cot.bankingappmvc.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class BankService implements BankRepository {

    JdbcTemplate jdbcTemplate;
    BankMapper bankMapper;

    @Autowired
    public BankService(JdbcTemplate jdbcTemplate, BankMapper bankMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.bankMapper = bankMapper;
    }


    @Override
    public Bank getBankBuId(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM banks WHERE id= ?", bankMapper, id);
    }
}


