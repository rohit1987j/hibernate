package com.example.hibernate.dto;

import javax.validation.constraints.NotNull;

public class CourseDto {
	@NotNull
	private String name;

	@NotNull
	private int teacherId;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
