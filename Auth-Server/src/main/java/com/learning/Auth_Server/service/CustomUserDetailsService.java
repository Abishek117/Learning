package com.learning.Auth_Server.service;

import com.learning.Auth_Server.entity.User;
import com.learning.Auth_Server.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CustomUserDetailsService /*implements UserDetailsService*/ {

    @Autowired
    UserRepository userRepository;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<User> user = userRepository.findAllByUsername(username);
        if (user == null) {
            return null;
        }
        return null;
    }
}
