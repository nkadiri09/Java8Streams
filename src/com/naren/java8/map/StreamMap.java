package com.naren.java8.map;

import com.naren.java8.model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {

    Student studen1 = new Student("Narendra", "20", "IT", 200);
    Student studen2 = new Student("Kadiri", "40", "IT", 100);
    Student studen3 = new Student("Ravi", "30", "IT", 300);
    Student studen4 = new Student("Ramesh", "60", "IT", 400);
    Student studen5 = new Student("kondety", "19", "CSIT", 1000);
    Student studen6 = new Student("padma", "55", "IIT", 200);

    public static void main(String[] args) {
        StreamMap sm= new StreamMap();
        //sm.testIntToString();
        //sm.testMapObjectToString();
        //sm.testMapToInt();
        sm.testListToStreams();
    }

    public void testMapToInt(){
        List<Student> students = Arrays.asList(studen1, studen2, studen3, studen4, studen5, studen6);
        int sum = students.stream().filter(student->student.getDept().equals("IT"))
                .mapToInt(student->student.getMarks()).sum();
        System.out.println(sum);
    }

    public void testMapObjectToString(){
        // Mapping one student Object to another String
        List<Student> students = Arrays.asList(studen1, studen2, studen3, studen4);
        List<String> namesList = students.stream().
                map(student-> student.getName()).collect(Collectors.toList());
        System.out.println(namesList);
    }

    public void testIntToString(){
        List<Integer> ints = Arrays.asList(4, 7, 8, 9, 10, 12);
        List<String> intString  = ints.stream().map(x->(x+"Naren")).collect(Collectors.toList());
        System.out.println(intString);
        List<Integer> intints = ints.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(intints);
    }

    public void testListToStreams(){
        List<Student> students = Arrays.asList(studen1, studen2, studen3, studen4);
        Stream<Student> streamList= students.stream();
        System.out.println(streamList);
    }

}
