package com.naren.java8.streams.predicate;

import java.util.function.Predicate;

public class StreamPredicate {

    public static void main(String[] args) {
        StreamPredicate sp = new StreamPredicate();
        sp.test();
    }

    private void test() {
        Predicate<Integer> even = i->i%2==0;
        Predicate<Integer> greaterThan10 = i->i>10;

        int[] ints = {0,1,10,20,30,44,47,50};

        System.out.println(even.test(99));
        System.out.println(even.negate().test(99));
    }

    public void predicateTest(Predicate<Integer> predicate, int[] x){

    }
}
