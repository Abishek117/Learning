package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Drivers;
import com.example.demo.repo.CrudRepository;

@Service
public class DriverService implements CrudRepository<Drivers> {

	@Autowired
	private JdbcTemplate template;

	@Override
	public int add(Drivers t)
	{
		String sql = "insert into drivers(driver_id,driver_name,age) values(?,?,?)";
		return template.update(sql,t.getDriverId(),t.getName(),t.getAge());
	}
	
	@Override
	public List<Drivers> findAll() 
	{
		String sql = "select * from drivers where driver_id";
		return template.query(sql, BeanPropertyRowMapper.newInstance(Drivers.class));
	}
	
	@Override
	public Drivers findById(int id) 
	{
		String sql = "select * from drivers where driver_id = ?";
		return template.queryForObject(sql, BeanPropertyRowMapper.newInstance(Drivers.class),id);
	}
	
	@Override
	public int update(Drivers t)
	{
		String sql = "update drivers set age = ? where driver_id = ?";
		return template.update(sql, t.getAge(),t.getDriverId());
	}
	
	@Override
	public int remove(int id)
	{
		String sql = "delete from drivers where driver_id = ?";
		return template.update(sql, id);
	}
	
	public List<Map<String,Object>> getAllDrivers()
	{
		String sql = "select * from drivers";
		return template.queryForList(sql);
	}
	
	public List<Integer> getAllDriversName()
	{
		String sql = "select driver_id from drivers";
		return template.queryForList(sql,Integer.class);
	}
	
	
	

}
