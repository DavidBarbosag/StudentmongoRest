package com.eci.ARSW.CaptureStudent.repository;

import com.eci.ARSW.CaptureStudent.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    Student findByName(String name);

    void deleteByName(String name);
}

