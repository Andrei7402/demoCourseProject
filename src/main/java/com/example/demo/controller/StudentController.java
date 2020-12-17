package com.example.demo.controller;

import com.example.demo.model.GroupOfStudent;
import com.example.demo.model.Student;
import com.example.demo.service.Impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("stud")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/getAll")
    public String getAllStudent(Model model) {
        model.addAttribute("student", studentService.getAll());
        return "allStudent";
    }

    @PostMapping("/{id}")
    public String removeUser(@PathVariable("id") Long id) {
        studentService.remove(id);
        return "redirect:/stud/getAll";
    }

    @GetMapping("/create")
    public String createStudent(Model model) {
        model.addAttribute("st", new Student());
        return "createStudent";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("st") Student student) {
       student.setGroupOfStudentList(List.of(new GroupOfStudent(1820L)));
        studentService.save(student);
        return "redirect:/stud/getAll";
    }




    @GetMapping("/getPageByName")
    public String getPageFindByName(Model model) {
        model.addAttribute("str", new Student());
        return "getByName";
    }


    @PostMapping("/getListOfName")
    public String getByName(@ModelAttribute("str") Student student, Model model) {
        List<Student> list = new ArrayList<>();
//        list = studentService.findAllByLastName(student.getLastName());
        list = studentService.test11(student.getLastName());
        model.addAttribute("listStudentByLastName",list);
        return "getAllStudent";
    }
}
