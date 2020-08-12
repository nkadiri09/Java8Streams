package com.naren.java8.model;

import java.util.List;

public class School {
    private static List<Student> students;
    private String name;
    private String address;



    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Student> getStudents() {
        return students;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
