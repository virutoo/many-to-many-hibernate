package com.ty.many_to_many.teacher_subject.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.many_to_many.teacher_subject.dto.Subject;
import com.ty.many_to_many.teacher_subject.dto.Teacher;

public class Dao {

	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = factory.createEntityManager();
	
	public void saveTeacher(Teacher teacher) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(teacher);
		for(Subject subject : teacher.getSubjects()) {
			entityManager.persist(subject);
		}
		transaction.commit();
	}
	
}
