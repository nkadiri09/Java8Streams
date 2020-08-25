package com.naren.java8.streams.filter;

import com.naren.java8.model.School;
import com.naren.java8.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsMisc {

    Student studen1 = new Student("Narendra", "20", "IT", 200);
    Student studen2 = new Student("Kadiri", "40", "IT", 100);
    Student studen3 = new Student("Ravi", "30", "IT", 300);
    Student studen4 = new Student("Ramesh", "60", "IT", 400);
    Student studen5 = new Student("kondety", "19", "CSIT", 1000);
    Student studen6 = new Student("padma", "55", "IIT", 240);


    public static void main(String[] args) {
        StreamsMisc sm = new StreamsMisc();
        sm.test();
            }

    public void test(){
        List<Student> students = Arrays.asList(studen1, studen2, studen3, studen4);
        List<Student> students1 = Arrays.asList(studen1, studen2, studen5, studen6 );
        School school= new School();
        school.setAddress("1234 main st flint, MI");
        school.setName("UMF");
        List<Student> studentsList = students!=null? new ArrayList<>():School.getStudents();
        System.out.println(studentsList);

    }
}
