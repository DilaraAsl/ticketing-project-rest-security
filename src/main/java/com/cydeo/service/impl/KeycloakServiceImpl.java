package com.cydeo.service.impl;

import com.cydeo.dto.UserDTO;
import com.cydeo.service.KeycloakService;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
@Service
public class KeycloakServiceImpl implements KeycloakService {
    @Override
    public Response userCreate(UserDTO dto) {
        return null;
    }

    @Override
    public void delete(String username) {

    }
}
