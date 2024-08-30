package com.learning.Auth_Server.repository;

import com.learning.Auth_Server.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAllByUsername(String username);
}
