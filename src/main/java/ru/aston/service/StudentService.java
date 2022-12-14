package ru.aston.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.aston.model.Student;
import ru.aston.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    //TODO
    public List<Student> getAllStudents() {
        return studentRepository.getAll();
    }

    //TODO
    public Student getStudent(String name) {
        return studentRepository.getByName(name);
    }
}
