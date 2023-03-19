package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example2
{
    //Presentation layer
    public static void main(String[] args) {
        try {
            methodA();
        } catch (IOException e) {
            System.out.println("not found file");
        } finally {
            System.out.println("success");
        }
    }

    //Business logic
    public static void methodA() throws IOException {
        methodB();
    }

    public static void methodB() throws IOException {
        methodC();
    }

    public static void methodC() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("./test.txt"))) {
            br.readLine();
        }
    }
}
