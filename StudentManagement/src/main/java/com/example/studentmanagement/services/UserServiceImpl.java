package com.example.studentmanagement.services;

import com.example.studentmanagement.dtos.user.CreateUserDTO;
import com.example.studentmanagement.dtos.user.UpdateUserDTO;
import com.example.studentmanagement.modals.User;
import com.example.studentmanagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User createUser(CreateUserDTO dto) {
        var user = new User(dto.getUsername(), dto.getPassword());
        // hashpass word

        return userRepository.save(user);
    }

    @Override
    public String updateUser(UpdateUserDTO dto) {
        return null;
    }

    @Override
    public String deleteUserById(String id) {
        return null;
    }

    //private methods
//    public String hashPassword(String password){
//
//    }


}
