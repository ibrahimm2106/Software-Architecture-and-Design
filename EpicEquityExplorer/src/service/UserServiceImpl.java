package service;

import repository.UserRepository;
import user.User;  // Import the User class

public class UserServiceImpl {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.save(user);
        System.out.println("User added: " + user.getUsername());  // Ensure getUsername() is accessible
    }
}
