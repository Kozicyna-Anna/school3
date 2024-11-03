package ru.hogwarts.school3.controller;

import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school3.model.Faculty;
import ru.hogwarts.school3.service.FacultyService;

import java.util.List;


@RestController
@RequestMapping("/faculty")

public class FacultyController {

    private final FacultyService facultyService;

    @GetMapping
    public List<Faculty> getAllFaculty() {
        return facultyService.getAll();
    }
    @PostMapping("/add")
    public Faculty createFaculty(@RequestParam String name, @RequestParam String color) {
        return facultyService.save(name, color);
    }

    @GetMapping("/{id}")
    public Faculty getFacultyById(@PathVariable Long id) {
        return facultyService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void  deleteFacultyById(@PathVariable Long id) {
        return  facultyService.deleteById(id);

    }
}