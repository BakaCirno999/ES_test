package com.example.consume.service.serviceImpl;

import com.example.consume.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUserById(Integer id) {
        return "aaa";
    }
}
