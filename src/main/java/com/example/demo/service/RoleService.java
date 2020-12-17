package com.example.demo.service;

import com.example.demo.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {

    Role save(Role role);

    List<Role> getAllRoles();

    void remove(Long id);

}
