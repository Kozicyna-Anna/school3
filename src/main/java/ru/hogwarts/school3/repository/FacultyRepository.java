package ru.hogwarts.school3.repository;

import org.springframework.stereotype.Repository;
import ru.hogwarts.school3.model.Faculty;

import java.util.List;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long>{
    List<Faculty> findAllByColor(String color);

}