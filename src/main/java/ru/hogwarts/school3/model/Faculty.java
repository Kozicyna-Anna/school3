package ru.hogwarts.school3.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.Collection;

@Entity
@GeneratedValue
public class Faculty {
    private Integer id;
    private String name;
    @Getter
    private String color;

    @OneToMany(mappedBy = "faculty")
    private Collection<Student> students;

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

