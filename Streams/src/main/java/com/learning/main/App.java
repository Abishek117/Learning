package com.learning.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.expression.spel.support.ReflectivePropertyAccessor.OptimalPropertyAccessor;

import com.learning.main.entity.Courses;
import com.learning.main.service.CourseService;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.learning.service"})
public class App 
{	
    public static void main( String[] args )
    {
		//SpringApplication.run(App.class, args);
        //ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
        //CourseService cs = ctx.getBean(CourseService.class);
        //System.out.println(cs.findCourses());
        //System.out.println(cs.getCourseById(1001));
        //Optional<Courses> c1 = cs.getCourseById(1005);
        //System.out.println(c1.toString());
        //List<Courses> c1 = cs.findCourses();
        //System.out.println(c1);
    	
        List<Integer> ci = Arrays.asList();
//        ci.stream().filter(f -> f%2==0).map(m -> m*2)
//        .forEach(n -> {
//        	int b = 1;
//        	int a = b + n;
//        	System.out.println(n);
//        	System.out.println(a);
//        });
        
        
        Optional<Integer> c = ci.stream().findFirst();
        
        int i = ci.stream().filter(f -> f%2==0).map(m -> m*2).reduce(0,(a,b)->(a+b)).intValue();
        System.out.println(c);
        
        
        
    }
}
