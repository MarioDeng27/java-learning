package com.dengtiannan.Service;


import com.dengtiannan.dao.User;
import com.dengtiannan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
