package com.auth0.samples.authapi.springbootauthupdated.com.auth.userhandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    ApplicationUserRepository userRepository;

    private BCryptPasswordEncoder pwEncoder;

    @Autowired
    public UserController(BCryptPasswordEncoder pwEncoder, ApplicationUserRepository userRepository) {
        this.userRepository = userRepository;
        this.pwEncoder = pwEncoder;
    }
}
