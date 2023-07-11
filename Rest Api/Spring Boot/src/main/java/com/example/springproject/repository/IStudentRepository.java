package com.example.springproject.repository;

import com.example.springproject.entity.Student;
import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

}