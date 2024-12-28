package com.librarysring.library.Repository;

import com.librarysring.library.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRep extends JpaRepository<User, Long>  {

    User findByUsername(String username);
}
