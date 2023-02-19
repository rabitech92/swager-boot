package com.jwt.boot.jwt.service;


import com.jwt.boot.jwt.entity.Role;
import com.jwt.boot.jwt.repository.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
