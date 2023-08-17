package com.example.testtask.security;

import com.example.testtask.entity.UserEntity;
import com.example.testtask.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    UserRepository userRepo;

    @Override
    public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepo
                .findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User with email   " + username + "    not found"));
        return UserDetailsImpl.build(userEntity);
    }
}
