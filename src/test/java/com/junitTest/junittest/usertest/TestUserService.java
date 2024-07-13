package com.junitTest.junittest.usertest;

import com.junitTest.junittest.user.model.User;
import com.junitTest.junittest.user.service.UserService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class TestUserService {

    @Autowired
    UserService userService;

    @Disabled
    @Test
    public void test(){
        assertEquals(2,4-2);

    }

    @Disabled
    @Test
    public void  findAllUserTest(){
        assertNotNull(userService.getAllUser());
    }

    @Disabled
    @Test
    public void save(){
        User user =new User();
        user.setFirstName("Ram");
        user.setPassword("ram");
        user.setUsername("bishnu1@gmail.com");
        user.setLastName("Pandey");

        User user1=userService.saveUser(user);

        assertNotNull(user1);
    }


    @ParameterizedTest
    @ValueSource(strings={"bishnu1@mail.com"})
    public void findByUserIdTest(String userId){
        User user =userService.findByUserId(userId);
        assertEquals(user.getUsername(),userId);
        assertNotNull(user);
    }
}
