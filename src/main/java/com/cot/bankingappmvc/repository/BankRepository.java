package com.cot.bankingappmvc.repository;

import com.cot.bankingappmvc.model.Bank;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankRepository {
    List<Bank> getAllBanks();

    Bank getBank(long id);

    int createBank(String name, String swift);

    void updateBank(long id, String name, String swift);

    void deleteBank(long id);

}
