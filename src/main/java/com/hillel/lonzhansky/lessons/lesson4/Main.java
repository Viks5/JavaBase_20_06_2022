package com.hillel.lonzhansky.lessons.lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int result = method2();
//        method1();
////        method3(10, 20, 30);
//
//        int a = 20;
//        System.out.println(a);


//        method1();
//        method1(10);
//        method1(10.6, 5);
//        method1(10.6, 10.2);

//        demoRecursion();


    }

    static void demoRecursion() {
        demoRecursion();
    }

    static void method1() {
        System.out.println("Hello");
        System.out.println("Hello");
        int a = 30;
        System.out.println(a);
        method2();
    }

    static void method1(int a) {

    }

    static void method1(double a, int b) {

    }

    static void method1(double a, double b) {

    }

    static int method2() {
        int a;
        return 10;
    }

    static void method3(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(sum);
    }


}


