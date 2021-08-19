package com.MongoStudent.MongoDbStudent;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface StudentRepository extends MongoRepository<Student,Long> {

}
