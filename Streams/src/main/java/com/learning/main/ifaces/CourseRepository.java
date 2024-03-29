package com.learning.main.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.main.entity.Courses;

@Repository
public interface CourseRepository extends JpaRepository<Courses, Integer> {

}
