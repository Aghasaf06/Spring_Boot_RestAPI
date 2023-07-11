package com.example.springproject.service;

import com.example.springproject.entity.Student;
import com.example.springproject.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> GetAllStudents() {
        return studentRepository.findAll();
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Integer id, Student student) {
        Optional <Student> foundedStudent = studentRepository.findById(id);

        if (foundedStudent.isPresent()) {
            Student newStudent = foundedStudent.get();

            newStudent.setId(student.getId());
            newStudent.setName(student.getName());
            newStudent.setSurname(student.getSurname());
            newStudent.setDateOfBirth(student.getDateOfBirth());
            newStudent.setStudentNumber(student.getStudentNumber());

            return studentRepository.save(newStudent);
        }

        return null;
    }
}
