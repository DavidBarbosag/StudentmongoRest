package com.eci.ARSW.CaptureStudent.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.util.Date;

@Document(collection = "students")
public class Student {

    @Id
    private String id;

    private String name;
    private String email;
    private Date birthDate;
    private String program;


    public Student() {}

    public Student(String name, String email, Date birthDate, String program) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.program = program;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

}
