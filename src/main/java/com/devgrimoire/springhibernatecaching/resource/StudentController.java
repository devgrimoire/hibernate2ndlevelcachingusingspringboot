package com.devgrimoire.springhibernatecaching.resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devgrimoire.springhibernatecaching.model.Student;
import com.devgrimoire.springhibernatecaching.repo.StudentRepo;

@RestController
public class StudentController {
	@Autowired
	private StudentRepo studentService;

	@GetMapping(value = "/student/all")
	public ResponseEntity<List<Student>> getAllStudent() {
		/*
		 * List<Student>getStuddents = new ArrayList<Student>();
		 * studentService.findAll().forEach({
		 * 
		 * }); //.; for(Iterator<Student> it :) {
		 * 
		 * }
		 */
		ResponseEntity<List<Student>> studentResponse = new ResponseEntity<List<Student>>(
				(List<Student>) studentService.findAll(), HttpStatus.OK);
		return studentResponse;
	}
}
