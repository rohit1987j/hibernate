package com.example.hibernate.dto;

import javax.validation.constraints.NotNull;

public class StudentDto {
	@NotNull
	private String name;

	@NotNull
	private String passportNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
}
