package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
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
public class DriverService implements CrudRepository<Drivers>
{

	@Autowired
	private JdbcTemplate template;

	@Override
	public int add(Drivers t)
	{
		String sql = "insert into drivers(driver_id,driver_name,age) values(?,?,?)";
		return template.update(sql,t.getDriverId(),t.getDriverName(),t.getAge());
	}
	
	@Override
	public List<Drivers> findAll() 
	{
		String sql = "select * from drivers";
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
	
	@Override
	public List<Map<String,Object>> getAllDrivers()
	{
		String sql = "select * from drivers";
		return template.queryForList(sql);
	}
	
	@Override
	public List<String> getAllDriversName()
	{
		String sql = "select driver_name from drivers";
		return template.queryForList(sql,String.class);
	}
	
	public int[] insertAll(List<Drivers> list)
	{
		String sql = "insert into drivers(driver_id,driver_name,age) values(?,?,?)";
		List<Object[]> l = new ArrayList<>();
		
		for(Drivers driver : list)
		{
			Object[] arr = {driver.getDriverId(),driver.getDriverName(),driver.getAge()};
			l.add(arr);
		}
		return template.batchUpdate(sql, l);
	}
	public void get()
	{
		String sql = "insert into drivers(driver_id,driver_name,age) values(?,?,?)";
		List<Object[]> batchArgs = Arrays.asList(
			    new Object[]{111,"abc",55},
			    new Object[]{222,"vfds",65}
			);
			int[] affectedRows = template.batchUpdate(sql, batchArgs);
			System.out.println(affectedRows);
	}
}
