package com.silvermate.backend.controller;

import com.silvermate.backend.config.ApiResponse;
import com.silvermate.backend.entity.User;
import com.silvermate.backend.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ApiResponse<?> login(@RequestBody User user) {
        User loggedUser = userService.login(user.getUserAccount(), user.getUserPassword());
        return ApiResponse.success(loggedUser);
    }
}
