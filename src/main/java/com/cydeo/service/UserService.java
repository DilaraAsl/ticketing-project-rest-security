package com.cydeo.service;


import com.cydeo.dto.UserDTO;
import com.cydeo.exception.TicketingProjectException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService  {

    UserDTO findByUserName(String username);
    List<UserDTO> listAllUsers();
    void save(UserDTO user);
//    void deleteByUserName(String username);
    UserDTO update(UserDTO user);
    void delete(String username) throws TicketingProjectException;
    List<UserDTO> listAllByRole(String role);

}
