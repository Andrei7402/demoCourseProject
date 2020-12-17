package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    Optional<User> findByUserName(String username);

    List<User> getAll();

    void remove(Long id);

    User saveUser(User user);

    Optional<User> findById(Long id);

}
