package com.naren.java8.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        StreamFilter sf = new StreamFilter();
        List<String> names = Arrays.asList("Narendra", "Ravindra",
                "Mahendra", "Rameswara", "Kadiri");

        List<String> namedras = names.stream().filter(x->x.endsWith("dra")).
                collect(Collectors.toList());
        System.out.println(namedras);

        List<String> contains = names.stream().filter(x->x.equals("Kadiri")).collect(Collectors.toList());
        System.out.println(contains);

        String ststicName = names.stream().filter(x->x.equals("ramesh")).findAny().orElse(getDefaultName());

        System.out.println(ststicName);
        String name = "Rameswara Reddy";
        String dynaName = names.stream().filter(x->x.equals("ramesh")).findAny().orElse(sf.getDefault1Name(name));

        System.out.println(dynaName);

        List<Integer> ints = Arrays.asList(4, 7, 8, 9, 10, 12);
    }

    private static String getDefaultName(){
        return "Narendra Reddy";
    }

    private String getDefault1Name(String name){
        return "Narendra Reddy111111 "+name;
    }
}
