package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConifg {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args ->{
            Student ryan = new Student(
                    "Ryan",
                    "Ryan.Lo@gmail.com",
                    LocalDate.of(2000, Month.MAY, 10)

            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2014, Month.MAY, 10)

            );

            studentRepository.saveAll(
                    List.of(ryan, alex)
            );
        };
    }
}
