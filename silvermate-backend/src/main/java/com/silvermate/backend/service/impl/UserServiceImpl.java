package com.silvermate.backend.service.impl;

import com.silvermate.backend.entity.User;
import com.silvermate.backend.repository.UserRepository;
import com.silvermate.backend.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

   private final UserRepository userRepository;

   public UserServiceImpl(UserRepository userRepository) {
      this.userRepository = userRepository;
   }

   @Override
   public User login(String userAccount, String userPassword) {
      return userRepository.findByUserAccountAndUserPassword(userAccount, userPassword);
   }
}
