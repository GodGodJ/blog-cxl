package com.lrm.blog.service;

import com.lrm.blog.dao.UserRepository;
import com.lrm.blog.po.User;
import com.lrm.blog.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUser(String username, String password) {
        User user=userRepository.findByUsernameAndPassword(username, MD5Util.code(password));
        return user;
    }
}
