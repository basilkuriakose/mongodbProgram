package com.MongoStudent.MongoDbStudent;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/student")
public class StudentController {
private StudentRepository student;



public StudentController(StudentRepository student) {
	super();
	this.student = student;
}

@GetMapping("/all")
public List<Student> getAll(){
    List<Student> stud = this.student.findAll();

    return stud;
}

@PutMapping("/")
public void insert(@RequestBody Student stud){
    this.student.insert(stud);
}

@PostMapping("/update")
public void update(@RequestBody Student stud){
    this.student.save(stud);
}
@DeleteMapping("/delete")
public void delete(@RequestBody Student stud){
    this.student.delete(stud);
}

}
