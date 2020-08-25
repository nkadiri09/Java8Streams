package com.naren.java8.doublecolon;

import java.util.function.BiFunction;

public class Java8MethodReference1c {

    public static void main(String[] args) {

        // anonymous class
        String result1 = playTwoArgument(1, 2, new BiFunction<Integer, Integer, String>() {
                  @Override
                  public String apply(Integer a, Integer b) {
                      return IntegerUtils.join(a, b);
                  }
              });                                                                   // 3

        // lambda
        //String result1 = playTwoArgument(1, 2, (a, b) -> IntegerUtils.join(a, b));  // 3

        // method reference
        String result2 = playTwoArgument(1, 2, IntegerUtils::join);                 // 3

    }

    private static <R> R playTwoArgument(Integer i1, Integer i2,
        BiFunction<Integer, Integer, R> func) {
        return func.apply(i1, i2);
    }

}

class IntegerUtils{

    public static String join(Integer a, Integer b) {
        return String.valueOf(a + b);
    }

}