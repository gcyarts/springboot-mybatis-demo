package com.example.products.Mapper;

import com.example.products.Dao.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {

    int insertUser(User user);
    User validate(User user);

}
