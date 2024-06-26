package dev.project.awbd;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class BCryptPasswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "dragomirgabriel";  // Change this to your desired password
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println(encodedPassword);
    }
}
