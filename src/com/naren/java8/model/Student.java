package com.naren.java8.model;

public class Student {

    private String name;
    private String age;
    private String dept;
    private int marks;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    public Student(String name, String age, String dept, int marks) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
