package com.cot.bankingappmvc.repository;

import com.cot.bankingappmvc.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    User getUserBuId(int id);
}
