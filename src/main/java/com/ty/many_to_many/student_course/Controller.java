package com.ty.many_to_many.student_course;

import java.util.ArrayList;
import java.util.List;

import com.ty.many_to_many.student_course.dao.Dao;
import com.ty.many_to_many.student_course.dto.Course;
import com.ty.many_to_many.student_course.dto.Student;

public class Controller {
	
	public static void main(String[] args) {
		Course course = new Course();
		
		List<Student> students = new ArrayList<Student>();
		int id[] = {1,2};
		String name[] = {"rocklee","neji"};
		int age[] = {12,13};
		
		for(int i=0; i<id.length; i++) {
			Student student = new Student();
			student.setId(id[i]);
			student.setAge(age[i]);
			student.setName(name[i]);
			students.add(student);
		}
		
		course.setId(1);
		course.setName("jave");
		course.setCost(120);
		course.setStudents(students);
		
		Dao dao = new Dao();
		dao.saveDetails(course);
		System.out.println("data saved");
	}

}
