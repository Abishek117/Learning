package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Movies;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Integer> {

}
