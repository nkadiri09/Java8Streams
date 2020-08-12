package com.naren.java.generics.singletypeparameter;

public class DemoTest {

    public static void main(String[] args) {
        DemoTest dt = new DemoTest();
        dt.testGenericClass();

    }
    public void testGenericClass(){
        DemoClass<String> string  = new DemoClass<>();
        string.setT("Narendra");
        System.out.println(string.getT());

        DemoClass<Integer> integer  = new DemoClass<>();
        integer.setT(20000);
        System.out.println(integer.getT());
    }
}
