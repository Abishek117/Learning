package com.example.demo.repo;

import java.util.List;
import java.util.Map;

import com.example.demo.entity.Drivers;

public interface CrudRepository <T>
{
	public int add(T t);     							//update()
	public List<T> findAll();							//query()
	public T findById(int id);							//queryForObject()	
	public int update(T t);								//update()
	public int remove(int id);							//update()
	public List<Map<String,Object>> getAllDrivers();	//queryForList()
	public List<String> getAllDriversName();			//queryForList()
	public int insertAll(List<T> list);					//bacthUpdate()

}
