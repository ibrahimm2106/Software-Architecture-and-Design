package repository;

import user.User;

public interface UserRepository {
    void save(User user);
    User findByUsername(String username);
    void deleteUser(User user);
}
