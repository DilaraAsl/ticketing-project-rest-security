package com.cydeo.controller;

import com.cydeo.annotation.ExecutionTime;
import com.cydeo.dto.ResponseWrapper;
import com.cydeo.dto.UserDTO;
import com.cydeo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/api/v1/user")
@Tag(name="UserController",description = "User API") //swagger tag
public class UserController {
    private final UserService userService;// if there were more than one class under UserService for ex: UserServiceImpl1 &UserServiceImpl2
    // then we need to give precedence to one by add  @Primary at class level  with @Service annotation

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ExecutionTime // this is our annotation
    @GetMapping
    @RolesAllowed({"Manager","Admin"}) //JAX-RS annotation
    public ResponseEntity<ResponseWrapper> getUsers(){ // ResponseEntity represents the whole HTTP response: status code, headers, and body
        // we use it to fully configure the HTTP response
        //ResponseEntity is a generic class
        //We are passing ResponseWrapper because we want to customize the json object
        return ResponseEntity.ok(new ResponseWrapper("All users retrieved with success", userService.listAllUsers(), HttpStatus.OK));
        // difference between .ok -- postman upper corner and HttpStatus.OK --in the body
    }
    @PostMapping
    @RolesAllowed("Admin")
    @Operation
public ResponseEntity<ResponseWrapper> createUser(@RequestBody UserDTO userDTO){
        userService.save(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseWrapper("user is successfully created",HttpStatus.OK));


}
}
