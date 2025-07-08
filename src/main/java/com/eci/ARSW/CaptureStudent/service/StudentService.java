package com.eci.ARSW.CaptureStudent.service;

import com.eci.ARSW.CaptureStudent.model.Student;
import com.eci.ARSW.CaptureStudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(String id, Student updatedStudent) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();
            existingStudent.setEmail(updatedStudent.getEmail());
            existingStudent.setBirthDate(updatedStudent.getBirthDate());
            existingStudent.setProgram(updatedStudent.getProgram());
            return studentRepository.save(existingStudent);
        }
        return null;
    }

}
