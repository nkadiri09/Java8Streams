package com.naren.java8.streams.match;

import com.naren.java8.streams.service.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AllMatchExample {

    public static void main(String[] args) {

        Predicate<Employee> p1 = e -> e.id < 10 && e.name.startsWith("A");
        Predicate<Employee> p2 = e -> e.sal < 10000;
        List<Employee> employeeList = new ArrayList<>();
        populateEmployee(employeeList);

        boolean b1 = employeeList.stream().allMatch(p1);
        System.out.println("All employees having 'eid<10' & 'ename.equalsIgnoreCase('A')'?= " + b1 + "\n");

        boolean b2 = employeeList.stream().allMatch(p2);
        System.out.println("All employees having 'esalary<10000'?= " + b2 + "\n");

        boolean b3 = employeeList.stream().anyMatch(p1);
        System.out.println("Any employee having 'eid<10' & 'ename.equalsIgnoreCase('A')'?= " + b3 + "\n");

        boolean b4 = employeeList.stream().anyMatch(p2);
        System.out.println("Any employee having 'esalary<10000'?= " + b4 + "\n");

        boolean b5 = employeeList.stream().noneMatch(p1);
        System.out.println("No employee having 'esalary<10000'?= " + b5);
    }

    private static void populateEmployee( List<Employee> empList) {
        empList.add(new Employee(1, "A", 2000));
        empList.add(new Employee(2, "B", 3000));
        empList.add(new Employee(3, "C", 4000));
        empList.add(new Employee(4, "D", 5000));
    }
}
