package com.cot.bankingappmvc.repository;

import com.cot.bankingappmvc.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    User getUserBuId(int id);

    List<User> getAllUsers();
    int addUser(User user);
    int addUser(String name, String industry, String residency, String login, String password);
}
