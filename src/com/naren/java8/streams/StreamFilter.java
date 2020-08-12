package com.naren.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Narendra", "Ravindra",
                "Mahendra", "Rameswara", "Kadiri");

        List<String> namedras = names.stream().filter(x->x.endsWith("dra")).
                collect(Collectors.toList());
        System.out.println(namedras);

        List<String> contains = names.stream().filter(x->x.equals("Kadiri")).collect(Collectors.toList());
        System.out.println(contains);

        String name = names.stream().filter(x->x.equals("ramesh")).findAny().orElse(getDefaultName());

        System.out.println(name);
        List<Integer> ints = Arrays.asList(4, 7, 8, 9, 10, 12);



    }

    private static String getDefaultName(){
        return "Narendra Reddy";
    }
}
