package com.example.testtask.service;

import com.example.testtask.entity.UserEntity;
import com.example.testtask.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;


    public void save(UserEntity entity) {
        userRepository.save(entity);
    }


}
