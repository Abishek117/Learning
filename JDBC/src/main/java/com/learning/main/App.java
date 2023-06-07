package com.learning.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException
    {
    	ResourceBundle rb = ResourceBundle.getBundle("application");
    	
    	String url = rb.getString("url");
        String user = rb.getString("user");
        String pass = rb.getString("pass");
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,user,pass);
		PreparedStatement pst = conn.prepareStatement("Select * from student where name = ?");
		pst.setString(1, "manoj");
		ResultSet rs = pst.executeQuery();
		//System.out.println(rs.toString());
		/*
		   When the ResultSet object is created, it just holds a 'reference' to the actual result set data obtained from the database. 
		   However, the data is not stored directly within the ResultSet object itself. Instead, the ResultSet object acts as a cursor or pointer to the
		   result-set data, which is typically held on the database server or in memory buffers managed by the database driver.
		   When you call the toString() method on the ResultSet object, it returns a string that includes the class name (com.mysql.cj.jdbc.result.ResultSetImpl)
		   and a unique identifier (@2f465398), which is typically the memory address or some other identifier for the object.
		   To access the actual data stored in the ResultSet, you need to use the appropriate methods provided by the JDBC API. These methods, such as getInt(), getString(), or others depending on the data types, retrieve the data from the underlying result set as you navigate through the rows using methods like next().
		 */
		
	
		while(rs.next())
		{
			String id = rs.getString("StudentId");
			String dob = rs.getString("dob");
			System.out.println(id +" "+ dob);
			
		}
		
    }
    
}
