package com.tasky.tasky.configs;

import com.tasky.tasky.entities.User;
import com.tasky.tasky.entities.UserRole;
import com.tasky.tasky.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadTestData(UserRepository userRepository) {
        return args -> {
            userRepository.save(new User(null, "Alice", "pass123", "alice@example.com", UserRole.MEMBER));
            userRepository.save(new User(null, "Bob", "secret456", "bob@example.com", UserRole.VIEWER));
            userRepository.save(new User(null, "Charlie", "qwerty789", "charlie@example.com", UserRole.OWNER));
        };
    }
}
