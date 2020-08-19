package com.naren.java8.functions;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest ft= new FunctionTest();
        ft.test();
    }


    public void test(){
        Function<Integer,Integer> add1 = x -> x + 1;
        Function<String,String> concat = x -> x + 1;


        Integer two = add1.apply(1); //yields 2
        String answer = concat.apply("Narendra = "); //yields "0 + 1 = 1"
        System.out.println(answer);
    }

}
