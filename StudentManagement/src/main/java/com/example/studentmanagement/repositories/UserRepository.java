package com.example.studentmanagement.repositories;

import com.example.studentmanagement.modals.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
