package com.chapter2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chapter2.beans.Address;
import com.chapter2.beans.School;
import com.chapter2.beans.Student;

@Configuration
public class SchoolConfig {
	
	@Bean(name={"donBosco"})
	School getSchool(Address donBoscoAddress)
	{
		School school = new School();
		school.setAddress(donBoscoAddress); 
		school.setName("Don Bosco");
		return school;
	}
	@Bean(name={"donBoscoAddress"})
	Address getDonBoscoAddress()
	{
		Address address = new Address();
		address.setLine1("opposite to mahila college");
		address.setLine2("front gate");
		address.setStreetNumber("12th road");
		address.setStreetName("chunapur road");
		address.setTown("purniea");
		address.setCountry("india");
		return address;
	}
	@Bean
	Student getDonBoscoSchoolStudents(School donBosco)
	{
		Student donBoscoSchoolStudent = new Student();
		donBoscoSchoolStudent.setSchool(donBosco);
		return donBoscoSchoolStudent;
	}

}
