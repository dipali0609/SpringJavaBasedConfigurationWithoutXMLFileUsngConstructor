package com.edu;

import org.springframework.stereotype.Component;

//@Component //gives an object
public class Student {
		
		private int sid;
		private String name;
		
		public Student(int sid,String name) {
			super();
			this.sid = sid;
			this.name= name;
		}
		
		public void display() {
			System.out.println("Student id::"+sid);
			System.out.println("Studnet id::"+name);
		}

	}

