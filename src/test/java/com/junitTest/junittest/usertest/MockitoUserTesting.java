package com.junitTest.junittest.usertest;

import com.junitTest.junittest.user.repository.UserRepository;
import com.junitTest.junittest.user.service.UserService;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class MockitoUserTesting {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

}
