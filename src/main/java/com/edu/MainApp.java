package com.edu;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfig.class);
		Student student=(Student) ctx.getBean(Student.class);
		student.display();
				
		Course course=(Course)ctx.getBean(Course.class);
		course.displayCourse();

	}

}