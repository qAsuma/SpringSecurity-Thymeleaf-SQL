package com.example.testtask.service;

import com.example.testtask.entity.UserEntity;
import com.example.testtask.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    private BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }


    public void save(UserEntity entity) {
        entity.setPassword(encoder().encode(entity.getPassword()));
        userRepository.save(entity);
    }


}
