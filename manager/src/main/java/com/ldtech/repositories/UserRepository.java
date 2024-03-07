package com.ldtech.repositories;

import com.ldtech.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<Object> findByEmail(String email);
    Boolean existsByEmail(String email);
}