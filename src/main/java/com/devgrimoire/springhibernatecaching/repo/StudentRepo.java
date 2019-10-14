package com.devgrimoire.springhibernatecaching.repo;

import org.springframework.data.repository.CrudRepository;

import com.devgrimoire.springhibernatecaching.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
