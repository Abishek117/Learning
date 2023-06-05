package com.example.demo.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Integer> 
{
	@Query(nativeQuery = true,value = "select user_id from user_profile")
	public ArrayList<Integer> getByProileId(int id);
}
