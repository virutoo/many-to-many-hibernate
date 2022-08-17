package com.ty.many_to_many.teacher_subject.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.many_to_many.teacher_subject.dao.Dao;
import com.ty.many_to_many.teacher_subject.dto.Subject;
import com.ty.many_to_many.teacher_subject.dto.Teacher;

public class SaveTeacher {
	
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		int[] id = {1,4,5};
		String[] name = {"bilogy","ninjutsu","forbidden jutsu"};
		int[] days = {39,23,37};
		List<Subject> subjects = new ArrayList<Subject>();
		
		for(int i=0; i<id.length; i++) {
			Subject subject = new Subject();
			subject.setId(id[i]);
			subject.setName(name[i]);
			subject.setDays(days[i]);
			subjects.add(subject);
		}
		
		teacher.setSubjects(subjects);
		teacher.setId(2);
		teacher.setName("urochimaru");
		teacher.setAge(34);
		
		Dao dao = new Dao();
		dao.saveTeacher(teacher);
		System.out.println("data saved");
	}

}
