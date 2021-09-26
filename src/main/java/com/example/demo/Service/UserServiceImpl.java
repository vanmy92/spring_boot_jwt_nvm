package com.example.demo.Service;

import com.example.demo.Authen.UserPrincipal;
import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired

    private UserRepository repository;
    @Override
    public User createUser(User user) {
        return repository.saveAndFlush(user);
    }

    @Override
    public UserPrincipal findByUsername(String username) {
        return null;
    }
}
