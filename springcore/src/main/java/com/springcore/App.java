package com.springcore;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
//    		Student student=new Student();
//        	student.setStudentName("Mahesh");
    	//logger.trace("We've just greeted the user!");
       // logger.debug("We've just greeted the user!");
        logger.info("We've just greeted the user!");
        //logger.warn("We've just greeted the user!");
        //logger.error("We've just greeted the user!");
        //logger.fatal("We've just greeted the user!");
        
    		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    		Student student=(Student) context.getBean("Student1");
        	System.out.println(student);
    }
}
