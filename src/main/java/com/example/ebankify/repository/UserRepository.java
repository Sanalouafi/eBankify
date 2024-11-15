package com.example.ebankify.repository;

import com.example.ebankify.model.User;
import com.example.ebankify.model.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;
public interface UserRepository extends JpaRepository<User,Long>{
    Optional<User> findByEmail(String email);
    Optional<User> findAllByUsername(String username);
    List<User> findByRole(Role role);
}
