package com.ty.many_to_many.teacher_subject.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {

	@Id
	private int id;
	private String name;
	private int days;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", days=" + days + "]";
	}
	
}
