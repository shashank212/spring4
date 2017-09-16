package com.chapter2.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.StringUtils;

import com.chapter2.beans.School;
import com.chapter2.beans.Student;

public class JavaConfigExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.chapter2.config.SchoolConfig.class);
		School school = (School) context.getBean("donBosco");
		System.out.println(school.getName());
		
		//example of beans without name 
		Student students = (Student) context.getBean("getDonBoscoSchoolStudents");
		System.out.println(students.getSchool().getName());
		context.close();
		System.out.println(StringUtils.);
	}
}
