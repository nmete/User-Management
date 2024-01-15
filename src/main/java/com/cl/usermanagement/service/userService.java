package com.cl.usermanagement.service;

import com.cl.usermanagement.Entity.User;
import com.cl.usermanagement.dto.UserDto;
import org.springframework.stereotype.Service;

public interface userService {
    UserDto createUser(UserDto use);
    User getUserById(Long id);
}
