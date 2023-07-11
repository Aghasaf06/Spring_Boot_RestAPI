package com.example.springproject;

import com.example.springproject.entity.Student;
import com.example.springproject.repository.IStudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringprojectApplication.class, args);
    }

}
