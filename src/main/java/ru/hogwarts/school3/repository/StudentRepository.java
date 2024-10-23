package ru.hogwarts.school3.repository;

import ru.hogwarts.school3.model.Student;

import java.util.List;

public interface StudentRepository  extends JpaRepository<Student, Long> {

    List<Student> findAllByAge (int age);
}
