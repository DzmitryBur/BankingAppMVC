package com.cot.bankingappmvc.service;


import com.cot.bankingappmvc.mapper.BankMapper;
import com.cot.bankingappmvc.model.Bank;
import com.cot.bankingappmvc.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService implements BankRepository {

    private JdbcTemplate jdbcTemplate;
    private BankMapper bankMapper;

    @Autowired
    public BankService(JdbcTemplate jdbcTemplate, BankMapper bankMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.bankMapper = bankMapper;
    }

    @Override
    public List<Bank> getAllBanks() {
        return jdbcTemplate.query("SELECT * FROM banks", bankMapper);
    }

    @Override
    public Bank getBank(long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM banks WHERE id=?", bankMapper, id);
    }

    @Override
    public int createBank(String name, String swift) {
        return jdbcTemplate.update("INSERT INTO banks (id, name, swift) VALUES (DEFAULT,?,?)", name, swift);

    }

    @Override
    public void updateBank(long id, String name, String swift) {
    }


    @Override
    public void deleteBank(long id) {
        jdbcTemplate.update("DELETE FROM banks WHERE id=?", id);
    }
}

