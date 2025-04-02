package com.example.jour2.model;


import jakarta.validation.constraints.*;

public class UserForm {

    @NotEmpty(message = "Le nom ne peut pas être vide")
    private String name;

    @NotNull(message = "L'âge ne peut pas être vide")
    @Min(value = 18, message = "Vous devez avoir au moins 18 ans")
    private Integer age;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}