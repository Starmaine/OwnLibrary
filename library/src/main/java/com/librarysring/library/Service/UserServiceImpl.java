package com.librarysring.library.Service;

import com.librarysring.library.Entity.User;
import com.librarysring.library.Repository.UserRep;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRep userRep;

    public UserServiceImpl(UserRep userRep) {
        this.userRep = userRep;
    }


    @Override
    public void saveUser(User user) {
        userRep.save(user);
    }

    @Override
    public String updateUser(Long id, User user) {
        if(userRep.existsById(id)) {
            user.setId(id);
            userRep.save(user);
            return "User was successfully updated!";
        }
        return "User not found!";
    }

    @Override
    public void deleteUser(Long id) {
        userRep.deleteById(id);
    }

    @Override
    public User findUserByUsername(String username) {
        return userRep.findByUsername(username);
    }
}
