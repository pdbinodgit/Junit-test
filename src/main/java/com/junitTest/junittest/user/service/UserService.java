package com.junitTest.junittest.user.service;

import com.junitTest.junittest.user.model.User;


import java.util.List;

public interface UserService {

    public User saveUser(User user);

    public List<User> getAllUser();

    public User findByUserId(String email);



}
