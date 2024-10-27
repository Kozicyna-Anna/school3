package ru.hogwarts.school3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.hogwarts.school3.model.Student;

import java.util.Collection;
import java.util.List;

public interface StudentRepository  extends JpaRepository<Student, Integer> {

    Collection<Student> findByAgeBetween (int fromAge, int toAge);
}
