package com.web.doru.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Student {
    private UUID id;
    private final int age;
    private final String firstName;
    private final String LastName;
    private final String course;


    public Student(


            @JsonProperty("id") UUID id,
            @JsonProperty("age") Integer age,
            @JsonProperty("firstName") String firstName,
            @JsonProperty("lastName") String lastName,
            @JsonProperty("course") String course) {


        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.LastName = lastName;
        this.course = course;
    }


    public UUID getId() {
        return id;

    }

    public void setId(UUID id) {
        this.id = id;

    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getCourse() {
        return course;
    }
}
