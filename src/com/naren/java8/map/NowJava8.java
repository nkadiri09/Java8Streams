package com.naren.java8.map;

import com.naren.java8.model.Staff;
import com.naren.java8.model.StaffPublic;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8 {

    public static void main(String[] args) {

        List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );

        List<StaffPublic> result = staff.stream().map(temp -> {
            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if (temp.getName().equals("mkyong")) {
                obj.setExtra("Narendra");
            } else {
                obj.setExtra("Kadiri");
            }
            return obj;
        }).collect(Collectors.toList());

        System.out.println(result);

    }

}