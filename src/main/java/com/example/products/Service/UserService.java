package com.example.products.Service;

import com.example.products.Dao.User;

import java.util.List;

public interface UserService {
    int insertUser(User user);
    User validate(User user);
}
