package com.hillel.lonzhansky.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean booleanTrue = true;
        boolean booleanFalse = false;

//        int a = 10;
//        int b = 5;


//        if (a > b) {
//            System.out.println("a > b");
//        }
//
//        if (a >= b) {
//            System.out.println("a >= b");
//        }
//
//        if (a < b) {
//            System.out.println("a < b");
//        }
//
//        if (a <= b) {
//            System.out.println("a <= b");
//        }
//
//        if (a == b) {
//            System.out.println("a == b");
//        }
//
//        if (a != b) {
//            System.out.println("a != b");
//        }


//        if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a <= b");
//        }

//        if (a > b) {
//            System.out.println("a > b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a = b");
//        }


//        int a = 10;
//        int b = 5;
//        int c = 7;
//
//        if (a >= b) {
//            System.out.println("a >= b");
//
//            if (a > b) {
//                System.out.println("a > b");
//            }
//            if (a == b) {
//                System.out.println("a = b");
//            }
//        }


//        int a = 10;
//        int b = 5;
//        int c = 7;

//        if ((a > b) || (b > c)) {
//            System.out.println("a > b OR b < c");
//        }
//
//        if ((a != c) && (b != c) && (a == 9) || (a == 10))

//        if ((a == c) && (b != c) && (a == 9) || (a == 10)) {
//            System.out.println("YES");
//        }

//        if (true && ((false && false) || true)) {         -> (false && false) = false
//        if (true && (false || true)) {                    -> (false || true) = true
//        if (true && true) {                               -> (true && true) = true
//        if (true && ((false && false) || true)) {
//            System.out.println("YES");
//        }


//        String str1 = "Hello";
//        String str2 = "Hello";
//        String str3 = new String("Hello");
//
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));

//        int a = 10;
//
//        String str = "AAA";
//
////        System.out.println(str.equalsIgnoreCase("AAa"));
////        System.out.println(str.equals("AAA"));
//
//        switch (str) {
////            if (a == 1) {
////                System.out.println("a = 1");
////                break;
////            }
//            case "AAa":
//                System.out.println("LOWER CASE");
//                break;
//            case "AAA":
//                System.out.println("ALL UPPER");
//                break;
////            case 3:
////                System.out.println("a = 3");
////                break;
////            case 4:
////                System.out.println("a = 4");
////                break;
////            case 5:
////                System.out.println("a = 5");
////                break;
//            default:
//                System.out.println("default");
//                break;
//
//        }


        Scanner scanner = new Scanner(System.in);

//        System.out.println("Hello! Please enter boolean value");
//        boolean someBooleanVariable = scanner.nextBoolean();


        System.out.println("Hello! Please enter integer value");
        if (scanner.hasNextInt()) {
            int enteredValue = scanner.nextInt();
            System.out.println(enteredValue);
        } else {
            System.out.println("Wrong data");
            System.exit(0);
            scanner.next();
        }

        int team1player1 = scanner.nextInt();
        int team1player2 = scanner.nextInt();
        int team1player3 = scanner.nextInt();
        int team1player4 = scanner.nextInt();
        int team1player5 = scanner.nextInt();

        System.out.println(team1player1);
        System.out.println(team1player2);
        System.out.println(team1player3);
        System.out.println(team1player4);
        System.out.println(team1player5);

        scanner.close();
    }
}
