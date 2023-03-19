package org.example;

public class Example2_1
{
    //Presentation layer
    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException e) {
            System.out.println("undefiend");
        }
    }

    //Business logic
    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC(1, 0);
    }

    public static void methodC(Integer a, Integer b) {
        try {
            var division = a / b;
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }
}
