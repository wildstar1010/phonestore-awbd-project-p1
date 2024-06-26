package dev.project.awbd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        try {
            ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
            System.out.println("StoreApplication started successfully.");
        } catch (Exception e) {
            System.err.println("Error starting StoreApplication: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
