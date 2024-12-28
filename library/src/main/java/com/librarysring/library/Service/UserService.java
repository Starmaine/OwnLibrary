package com.librarysring.library.Service;

import com.librarysring.library.Entity.User;

public interface UserService {
    void saveUser(User user);
    String updateUser(Long id, User user);
    void deleteUser(Long id);
    User findUserByUsername(String username);
}
