package com.cydeo.service.impl;

import com.cydeo.dto.UserDTO;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl2 implements UserService {
    @Override
    public UserDTO findByUserName(String username) {
        return null;
    }

    @Override
    public List<UserDTO> listAllUsers() {
        return null;
    }

    @Override
    public void save(UserDTO user) {

    }

    @Override
    public UserDTO update(UserDTO user) {
        return null;
    }

    @Override
    public void delete(String username) {

    }

    @Override
    public List<UserDTO> listAllByRole(String role) {
        return null;
    }
}
