package com.example.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App 
{
    public static void main( String[] args )
    {
       try {
    	   //InputStreamReader isr = new InputStreamReader(System.in); 
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       String s  = br.readLine();
    	   //int i = br.read(); 														// when you use inputstreamreader's read(),it will read a single character as an integer and return its Unicode value
    	   System.out.println(s.toString());
    	   OutputStreamWriter osw = new OutputStreamWriter(System.out);
//	       osw.write(s);
//	       osw.write("\n");
//	       osw.write(String.valueOf(69));
//	       osw.flush();
    	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	   bw.write(s);
    	   bw.flush();
	       
      }catch(IOException e) {
    	  System.out.println(e.getMessage());
      }
       
    }
}
