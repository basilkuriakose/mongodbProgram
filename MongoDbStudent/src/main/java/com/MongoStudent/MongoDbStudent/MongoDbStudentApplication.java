package com.MongoStudent.MongoDbStudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class MongoDbStudentApplication {
	@Autowired
	private StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(MongoDbStudentApplication.class, args);
	}
	@Bean
	public CommandLineRunner initDB()
	{
		return (args) -> {
			this.studentRepository.save(new Student(1,"Ansil","Btech","MAC"));
			this.studentRepository.save(new Student(2,"Basil","MCA","ICET"));
		};
	}

}
