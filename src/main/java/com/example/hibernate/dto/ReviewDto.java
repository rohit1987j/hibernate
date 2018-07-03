package com.example.hibernate.dto;

import javax.validation.constraints.NotNull;

public class ReviewDto {
	@NotNull
	private int rating;
	@NotNull
	private int courseId;
	@NotNull
	private int studentId;
	private String description;

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
