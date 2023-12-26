package com.springsecurity.service;

import com.springsecurity.dto.UserRegistrationDto;
import com.springsecurity.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
