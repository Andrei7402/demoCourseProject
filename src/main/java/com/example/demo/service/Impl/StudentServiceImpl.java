package com.example.demo.service.Impl;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {



    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }

    @Override
     public List<Student> test11(String lastname) {
        return repository.findAllByLastName(lastname);
    }

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }


}
