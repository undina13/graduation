package com.undina.graduation.repository;

import com.undina.graduation.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;
@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User, Integer> {
//    @Query("SELECT u FROM User u WHERE u.email = LOWER(:email)")
//    @Cacheable("users")
@RestResource(rel = "by-email", path = "by-email")
@Query("SELECT u FROM User u WHERE u.email = LOWER(:email)")
    Optional<User> findUserByEmail(String email);

//    User save(User user);
//
//    // false if not found
//    boolean delete(int id);
//
//    // null if not found
//    User get(int id);
//
//    // null if not found
//    User getByEmail(String email);
//
//    List<User> getAll();
}
