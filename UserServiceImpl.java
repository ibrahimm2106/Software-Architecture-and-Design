package com.epic.equity.business;

import com.epic.equity.data.UserRepository;
import com.epic.equity.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl {
    
    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserByUsername(String username) {
        return Optional.ofNullable(userRepository.findByUsername(username));
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
