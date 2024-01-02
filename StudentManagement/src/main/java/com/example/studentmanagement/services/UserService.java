package com.example.studentmanagement.services;

import com.example.studentmanagement.dtos.user.CreateUserDTO;
import com.example.studentmanagement.dtos.user.UpdateUserDTO;
import com.example.studentmanagement.modals.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(String id);
    User getUserByUsername(String username);
    User createUser(CreateUserDTO dto);
    String updateUser(UpdateUserDTO dto); // return id update
    String deleteUserById(String id); // return id delete
}
