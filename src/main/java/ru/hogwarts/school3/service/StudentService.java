package ru.hogwarts.school3.service;

import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Service;
import ru.hogwarts.school3.model.Student;
import ru.hogwarts.school3.repository.StudentRepository;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class StudentService implements StudentService {

    public Collection<Student> findAll(){
        return StudentRepository.findAll();
    }


    public void remove(int id) {
        studentRepository.deleteById(id);
    }
   public Integer add(Student student) {
       return studentRepository.save(student).getId();
   }
   public Collection<Student> findByAgeBetween(int fromAge, int toAge){
        return studentRepository.findByAgeBetween(fromAge, toAge);
   }
}

