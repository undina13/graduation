package com.undina.graduation.repository;

import com.undina.graduation.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;
@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User, Integer> {
//    @Query("SELECT u FROM User u WHERE u.email = LOWER(:email)")
//    @Cacheable("users")
    Optional<User> findUserByEmail(String email);
}
