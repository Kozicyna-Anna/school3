package ru.hogwarts.school3.model;


import jakarta.persistence.*;
import lombok.Getter;

import java.util.Collection;

@Entity
@Table(name = "faculty")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String color;

    @OneToMany(mappedBy = "faculty")
    private Collection<Student> students;

    public Collection<Student> getStudents() {
        return students;
    }
    public void setStudents(Collection<Student> students) {
        this.students = students;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
}

