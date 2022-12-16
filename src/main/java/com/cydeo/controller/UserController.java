package com.cydeo.controller;

import com.cydeo.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@Tag(name="UserController",description = "User API") //swagger tag
public class UserController {
    private final UserService userService;// if there were more than one class under UserService for ex: UserServiceImpl1 &UserServiceImpl2
    // then we need to give precedence to one by add @Qualifier or @Primary with @Service annotation

    public UserController(UserService userService) {
        this.userService = userService;
    }
}
