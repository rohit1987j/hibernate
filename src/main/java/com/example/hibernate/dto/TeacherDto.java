package com.example.hibernate.dto;

import javax.validation.constraints.NotNull;

public class TeacherDto {
    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
