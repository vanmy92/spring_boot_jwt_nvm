package com.example.demo.Service;

import com.example.demo.Authen.UserPrincipal;
import com.example.demo.Entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
