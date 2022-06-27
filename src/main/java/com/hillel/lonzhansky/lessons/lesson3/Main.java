package com.hillel.lonzhansky.lessons.lesson3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = "World";
//
//        String result = str1 + " " + str2 + 10 + 5;
//        String result2 = str1 + " " + str2 + (10 + 5);
//        System.out.println(result);
//        System.out.println(result2);
//
//        char someChar = 'A';
//        int someInt = someChar;
//
//        System.out.println(someInt);
//
//        char charAfterCast = (char) someInt;
//        System.out.println(charAfterCast);
//
//
//        double someDouble = someInt;
//        long someLong = someInt;
//
//        System.out.println(someDouble);
//        System.out.println(someLong);
//
//        someLong = Long.MAX_VALUE;
//        someInt = (int) someLong;
//        System.out.println(someLong);
//        System.out.println(someInt);
//
//        someDouble = 99.8585854;
//        someInt = (int) someDouble;
//        System.out.println(someInt);
//
////        boolean someBoolean = false;
////        someDouble = (int) someBoolean; //ERROR
//
//        str1 = "1asdasdasd";
//        someInt = Integer.parseInt(str1);
//        System.out.println(someInt);


//        float someFloat1 = 0.1111111111111111f;
//        float someFloat2 = 9.999999f;
//        float result = someFloat1 + someFloat1 + someFloat1 + someFloat1 + someFloat1;
//
////        System.out.println(someFloat1);
////        System.out.println(someFloat2);
//        System.out.println(result);
//
//        double someDouble = 0.1111111111111111;
//        double result2 = someDouble + someDouble + someDouble + someDouble + someDouble;
//        System.out.println(result2);


//        double result = (double) 10 / 4;
//        int result2 = 10 % 4;  // 3 + 3 + 3 = 9 - 10-9 = 1
//
//        System.out.println(result);
//        System.out.println(result2);



//        int a = 10;
//
//        a = a + 1;
//
//        a++;
//
//        System.out.println(a);
//
//        a--;
//        a--;
//        a--;
//
//        System.out.println(a);



//        int a = 10;
//        a = a + 1;
//        ++a;
//
//        System.out.println(a);
//        --a;
//        --a;
//        --a;
//
//        System.out.println(a);




//        int a = 10;
//        System.out.println(10 + a++);
//        System.out.println(10 + a);



//        int a = 10;
//
////        a = a + 10;
//        a += 10;  // a = a + 10;
//        a -= 10;  // a = a - 10;
//        a *= 10;  // a = a * 10;
//        a /= 10;  // a = a / 10;
//        a %= 2;  // a = a % 2;
//
//        System.out.println(a);


//        float floatVariable1 = 10.222f;
//        float floatVariable2 = 10.5555f;
//
//        double doubleVariable1 = 10.23423423432;
//        double doubleVariable2 = -10.55553544;
//
//
//        int intVariable1 = Math.round(floatVariable1);
//        int intVariable2 = Math.round(floatVariable2);
//
//        long longVariable1 = Math.round(doubleVariable1);
//        long longVariable2 = Math.round(doubleVariable2);
//
//        System.out.println(intVariable1);
//        System.out.println(intVariable2);
//        System.out.println();
//        System.out.println(longVariable1);
//        System.out.println(longVariable2);
//
//        System.out.println();
//
//        int a = 5;
//        int b = 3;
//
//        double result = Math.pow(a, b);
//        System.out.println(result);
//        System.out.println();
//
//
//        a = 16;
//        result = Math.sqrt(a);
//        System.out.println(result);
//        System.out.println();
//
//
//        result = Math.abs(-10);
//        System.out.println(result);
//        System.out.println();
//
//
//        System.out.println(Math.random()); // диапазон 0.0 - 0.999999999999999999
//
//        int from = 10;
//        int to = 20;
//        System.out.println(from + (int) (Math.random() * to) + 1);
//        System.out.println(from + (int) (Math.random() * to) + 1);
//        System.out.println(from + (int) (Math.random() * to) + 1);



        // | a - b | / ( a + b )3 - √c
        int a = 2;
        int b = -3;
        int c = 16;

        double result = Math.abs(a - b) / (a + b) * 3 - Math.sqrt(c);
        System.out.println(Math.abs(a - b));
        System.out.println(Math.abs(a - b) / (a + b));
        System.out.println(Math.abs(a - b) / (a + b) * 3);
        System.out.println(Math.abs(a - b) / (a + b) * 3 - Math.sqrt(c));
        System.out.println(Math.sqrt(c));
        System.out.println(result);

        System.out.println();


        // ( a + b ) / 12 * c % 4 + |b|

        double result2 = (double) (a + b) / 12 * c % 4 + Math.abs(b);
//        System.out.println((a + b));
        System.out.println((double) (a + b) );
        System.out.println((double) 12);
//        System.out.println((double) (a + b) / 12);
//        System.out.println((double)(a + b) / 12 * c);
//        System.out.println((double)(a + b) / 12 * c % 4);
//        System.out.println((double)(a + b) / 12 * c % 4 + Math.abs(b));
        System.out.println(result2);


//        Расчет зарплаты
//        Дано: зарплаты трех работников за 1 месяц (a, b, c)
//        Рассчитать:
//        1. для каждого работника сумму зарплаты за 10 лет
//        2. вычесть 5% налог
//        3. посчитать среднее арифметическое по трем суммам за 10 лет
//        4. вывести суммы зарплат за 10 лет с учетом вычета налогов и
//        среднее арифм.

        System.out.println();
        System.out.println();

        double salary1 = 500;
        double salary2 = 1500;
        double salary3 = 3500;

        double TAX = 0.05;

        double salary1For10Years = salary1 * 120;
        double salary2For10Years = salary2 * 120;
        double salary3For10Years = salary3 * 120;

        System.out.println(salary1For10Years);
        System.out.println(salary2For10Years);
        System.out.println(salary3For10Years);
        System.out.println();

        double salary1WithoutTax = salary1For10Years - salary1For10Years * TAX;
        double salary2WithoutTax = salary2For10Years - salary2For10Years * TAX;
        double salary3WithoutTax = salary3For10Years - salary3For10Years * TAX;

        System.out.println(salary1WithoutTax);
        System.out.println(salary2WithoutTax);
        System.out.println(salary3WithoutTax);
        System.out.println();

        double avg = (salary1For10Years + salary2For10Years + salary3For10Years) / 3;
        double sum = (salary1WithoutTax + salary2WithoutTax + salary3WithoutTax) / 3;
        System.out.println(sum);
        System.out.println(avg);

        // Объем шара - 4/3*pi*r^3

    }
}
