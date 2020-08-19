package com.naren.java8.doublecolon;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8MethodReference1a
{
    public static void main(String[] args) {
        Java8MethodReference1a jm= new Java8MethodReference1a();
        jm.test();


        List<String> list = Arrays.asList("A", "B", "C");
        List<Integer> list1 = Arrays.asList(1,2,3,5,7,9);
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
               SimplePrint.print(s);
            }
        });

        list.forEach(x->SimplePrint.print(x));
        list.forEach(SimplePrint::print);
    }

    private void test() {
    }
}
