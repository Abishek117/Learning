package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {

}
