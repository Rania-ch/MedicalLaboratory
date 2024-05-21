package com.example.demo.repo;


import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepo extends JpaRepository <User,Long> {


    void deleteUserById(Long id);

    Optional<User> findUserById(Long id);
    @Modifying
    @Query("delete from User where email=?1")
    void deleteUserByEmail(String email);

    Optional<User> findUserByEmail(String email);
}
