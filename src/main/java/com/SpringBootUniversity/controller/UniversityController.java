package com.SpringBootUniversity.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.SpringBootUniversity.entity.University;
import com.SpringBootUniversity.repository.UniversityRepository;



public class UniversityController {
	private UniversityRepository repository;

    @PostMapping("/university")
    public University addUniversity(@RequestBody University university) {
        return repository.save(university);
    }
     

    @GetMapping("/university")
    public List<University> getUniversity() {
        return repository.findAll();
        
    }
   
}
