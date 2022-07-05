package com.cot.bankingappmvc.repository;

import com.cot.bankingappmvc.model.Bank;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository {
    Bank getBankBuId(int id);
}