package com.SpringBootUniversity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.SpringBootUniversity.entity.University;


public interface UniversityRepository extends JpaRepository<University,Integer> {

	

}
