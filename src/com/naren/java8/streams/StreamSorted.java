package com.naren.java8.streams;

import com.naren.java8.model.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSorted {

    public static void main(String[] args) {


        List<Integer> ints = Arrays.asList(4, 7, 8, 9, 10, 12);
        ints.stream().sorted().forEach(System.out::println);
        System.out.println("----------------------------------------------------");

        List<String> names = Arrays.asList("Narendra", "Ravindra",
                "Mahendra", "Rameswara", "Kadiri");

        names.stream().sorted().forEach(System.out::println);
        System.out.println("----------------------------------------------------");

        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println );
        System.out.println("----------------------------------------------------");

        Student studen1 = new Student("Narendra", "20", "IT", 200);
        Student studen2 = new Student("Kadiri", "40", "IT", 100);
        Student studen3 = new Student("Ravi", "30", "IT", 300);
        Student studen4 = new Student("Ramesh", "60", "IT", 400);
        List<Student> students = Arrays.asList(studen1, studen2, studen3, studen4);

        students.stream().sorted(Comparator.comparingInt(Student::getMarks)).
                forEach(System.out::println);





    }
}
