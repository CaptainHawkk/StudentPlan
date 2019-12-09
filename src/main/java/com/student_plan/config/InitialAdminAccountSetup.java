/*
package com.student_plan.config;

import com.student_plan.entity.Type;
import com.student_plan.entity.User;
import com.student_plan.repository.UserRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.nio.CharBuffer;


@Component
public class InitialAdminAccountSetup {

        InitialAdminAccountSetup(PasswordEncoder passwordEncoder){
            this.passwordEncoder = passwordEncoder;
        }

        InitialAdminAccountSetup(UserRepository userRepository){
            this.userRepository = userRepository;
        }
        private PasswordEncoder passwordEncoder;
        private UserRepository userRepository;

        @EventListener(ApplicationReadyEvent.class)
        public void createFirstAdminAccount() {

            if(userRepository.findById(1L).orElse(null) == null) {
                User admin = User.builder().firstName("admin")
                        .lastName("admin")
                        .mail("admin@gmail.com")
                        .type(Type.ADMIN)
                        .password(passwordEncoder.encode(CharBuffer.wrap("password")).toCharArray())
                        .build();

                userRepository.save(admin);
            }
        }

}
*/
