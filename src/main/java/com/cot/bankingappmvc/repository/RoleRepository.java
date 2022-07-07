package com.cot.bankingappmvc.repository;

import com.cot.bankingappmvc.model.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository {

    List<Role> getAllRoles();

    Role getRole(long id);

    int createRole(String role);

    void updateRole(long id, String role);

    void deleteRole(long id);

}

