package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAll();

    Student save(Student student);

    void remove(Long id);

    List<Student> test11(String lastname);
}
