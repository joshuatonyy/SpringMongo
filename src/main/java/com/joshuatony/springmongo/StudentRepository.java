package com.joshuatony.springmongo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface StudentRepository extends MongoRepository<Student, String>{
    Optional<Student> findStudentByEmail(String email);
}
