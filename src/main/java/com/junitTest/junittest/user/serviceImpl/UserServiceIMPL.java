package com.junitTest.junittest.user.serviceImpl;

import com.junitTest.junittest.user.model.User;
import com.junitTest.junittest.user.repository.UserRepository;
import com.junitTest.junittest.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public User saveUser(User user) {
        try {
            if (userRepository.existsByUsername(user.getUsername())){
                return null;
            }
            User user1 = userRepository.save(user);
            return user1;
        } catch (Exception e) {
           return null;
        }
    }
    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User findByUserId(String email) {
        try {
            Optional<User> userOptional = userRepository.findByUsername(email);
            if (userOptional.isPresent()) {
                return userOptional.get();
            } else {
                return new User();
            }
        }catch (Exception e){
            return null;
        }

    }

}
