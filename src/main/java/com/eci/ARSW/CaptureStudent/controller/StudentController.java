package com.eci.ARSW.CaptureStudent.controller;

import com.eci.ARSW.CaptureStudent.model.Student;
import com.eci.ARSW.CaptureStudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/search/byName")
    public Student getByName(@RequestParam String name) {
        return studentService.getStudentByName(name);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable String id, @RequestBody Student updatedStudent) {
        Student existing = studentService.getStudentById(id);
        if (existing != null) {
            existing.setName(updatedStudent.getName());
            existing.setEmail(updatedStudent.getEmail());
            existing.setBirthDate(updatedStudent.getBirthDate());
            existing.setProgram(updatedStudent.getProgram());
            return studentService.createStudent(existing); // save actualiza si ya existe
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        studentService.deleteStudentById(id);
    }
}
