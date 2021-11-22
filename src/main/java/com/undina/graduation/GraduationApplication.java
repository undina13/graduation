package com.undina.graduation;

import com.undina.graduation.model.Role;
import com.undina.graduation.model.User;
import com.undina.graduation.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
@AllArgsConstructor
public class GraduationApplication implements ApplicationRunner {
    private final UserRepository userRepository;


    public static void main(String[] args) {
        SpringApplication.run(GraduationApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//      userRepository.save(new User(1, "User_First", "user@gmail.com",  "password", Set.of(Role.USER)));
//      userRepository.save(new User( 2, "Admin_Last","admin@javaops.ru",  "admin", Set.of(Role.USER, Role.ADMIN)));


        System.out.println(userRepository.findByEmailIgnoreCase("user@gmail.com"));

    }
}
