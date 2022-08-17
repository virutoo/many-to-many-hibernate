package com.ty.many_to_many.student_course.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.many_to_many.student_course.dto.Course;
import com.ty.many_to_many.student_course.dto.Student;

public class Dao {
	
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = factory.createEntityManager();
	
	public void saveDetails(Course course) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		if(entityManager.find(Course.class, course.getId()) == null) {
			entityManager.persist(course);
		}
		
		for(Student student : course.getStudents()) {
			if(entityManager.find(Student.class, student.getId()) == null) {
				entityManager.persist(student);
			}
		}
		transaction.commit();
	}
	

}
