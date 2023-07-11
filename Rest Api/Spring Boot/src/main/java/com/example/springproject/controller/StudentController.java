package com.example.springproject.controller;

import com.example.springproject.entity.Student;
import com.example.springproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public List<Student> GetAllStudents() {
        return studentService.GetAllStudents();
    }

    @PostMapping("/new")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
    }

    @PutMapping("/edit/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }
}
