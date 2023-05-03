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
		while(rs.next())
		{
			String id = rs.getString("StudentId");
			String dob = rs.getString("dob");
			System.out.println(id +" "+ dob);
			
		}
		
    }
    
}
