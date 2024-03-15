package com.younes.demoSpringBoot.student;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents (){
        return List.of(
                new Student(
                        "Younes",
                        "Kabiri",
                        LocalDate.now(),
                        "younes@gmail.com",
                        34

                ),
                new Student(
                        "Joel",
                        "Panisello",
                        LocalDate.now(),
                        "joel@gmail.com",
                        30

                ),
                new Student(
                        "Arey",
                        "Ferrero",
                        LocalDate.now(),
                        "arey@gmail.com",
                        36

                )

        );
    }
}
