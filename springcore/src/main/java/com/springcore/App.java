package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    		Student student=new Student();
//        	student.setStudentName("Mahesh");

    		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    		Student student=(Student) context.getBean("Student1");
        	System.out.println(student);
    }
}
