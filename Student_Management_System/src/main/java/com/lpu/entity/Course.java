package com.lpu.entity;

import jakarta.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String trainer;

    
    @ManyToMany(mappedBy = "courses")
    
    private List<Student> students = new ArrayList<>();
    
    // Parameterized Constructor
    public Course(String name, String trainer) {
        super();
        this.name = name;
        this.trainer = trainer;
    }
    
    public List<Student> getStudents() {
        return students;
    }

    // Default Constructor (Mandatory for JPA)
    public Course() {
    }

    // Getters and Setters
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
}