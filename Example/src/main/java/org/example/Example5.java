package org.example;

import io.vavr.control.Option;
import io.vavr.control.Try;

public class Example5 {
    //Presentation layer
    public static void main(String[] args) {
        System.out.println(getResultDivision(1, 0));
    }

    //Business Layer
    static String getResultDivision(Integer a, Integer b) {
        return Try
                .of(() -> division(1, 0))
                .map(i -> i.toString())
                .getOrElse(() -> "undefined");
    }
    static Integer division(Integer a, Integer b) {
        return  a / b;
    }
}
