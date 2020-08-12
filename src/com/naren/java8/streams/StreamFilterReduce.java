package com.naren.java8.streams;

import com.naren.java8.model.Student;

import java.util.Arrays;
import java.util.List;

public class StreamFilterReduce {

    Student studen1 = new Student("Narendra", "20", "IT", 200);
    Student studen2 = new Student("Kadiri", "40", "IT", 100);
    Student studen3 = new Student("Ravi", "30", "IT", 300);
    Student studen4 = new Student("Ramesh", "60", "IT", 400);
    Student studen5 = new Student("kondety", "19", "CSIT", 1000);
    Student studen6 = new Student("padma", "55", "IIT", 200);

    public static void main(String[] args) {
        StreamFilterReduce sfr = new StreamFilterReduce();
        sfr.test();
    }
    public void test(){
        List<Student> students = Arrays.asList(studen1, studen2, studen3, studen4, studen5, studen6);
        int sum = students.stream().filter(student->student.getDept().equals("IT"))
                .mapToInt(student->student.getMarks()).sum();
        System.out.println(sum);

    }

}
