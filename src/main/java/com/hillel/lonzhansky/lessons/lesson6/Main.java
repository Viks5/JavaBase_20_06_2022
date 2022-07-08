package com.hillel.lonzhansky.lessons.lesson6;

public class Main {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 5;
//
//        if (a < b) {
//            System.out.println("a < b");
//        } else {
//            if (a == b) {
//                System.out.println("a = b");
//            } else {
//                System.out.println("a > b");
//            }
//        }
//
////        тернарный оператор java
//        System.out.println( a < b ? "a < b" : a == b ? "a = b" : "a > b");


//        for (  инициализация итератора ; проверка условия; увеличение счетчика) {

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

//        int i = 0;
//        for (; i < 10; i++) {
//            System.out.println(i);
//        }

//        int i = 0;
//        for (; i < 10;) {
//            System.out.println(i);
//            i++;
//        }
//        int i = 0;
//        for (;;) {
//            System.out.println(i);
//            i++;
//        }


//        int i = 0;
//
//
//        for (; i < 10; i++) {
//            int b = 10;
//
//            b = 14;
//            i = 20;
//        }
//
//        i = 20;


//        for (int i = 0; true; i++) {
//            if (i == 5) {
//                continue;
//            }
//            if (i == 7) {
//                break;
//            }
//            System.out.println(i);
//        }

//        task1();


//        for (byte i = 0; i > -1; i++) {
//            System.out.println(i);
//        }


        //--------------- WHILE ---------------------//


//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

//        int i = 0;
//        while (i < 10) {
//            if (i == 3) {
//                i++;
//                continue;
//            }
//            if (i == 5) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }

        //--------------- DO WHILE ---------------------//

//        int i = 20;
//        do {
//            if (i == 3) {
//                i++;
//                continue;
//            }
//            if (i == 5) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        } while (i < 10);

//        System.out.println(demoRecursion(5));
//        System.out.println(demoLoopFactorial(5));
//        bomb();

//        showFibonachi();



    }

    //Выведите на экран первые 11 членов последовательности Фибоначчи
    // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    static void showFibonachi() {
        int number1 = 1;
        int number2 = 1;
        int sum;

        System.out.print(number1 + " " + number2 + " ");
        for (int i = 3; i <= 11; i++) {
            sum = number1 + number2;
            System.out.print(sum + " ");
            number1 = number2;
            number2 = sum;
        }
        
    }
    



//    Сделайте бомбу с обратным отсчетом от 10 до 0 с помощью цикла WHILE
    static void bomb() {
        int i = 10;
        boolean isDemined = false;
        while (i >= 0) {
            System.out.println(i);

            int random = (int) (Math.random() * 101);
            System.out.println("random value = " + random);

            if (random > 75) {
                System.out.println("GOOD");
                isDemined = true;
                break;
            }
            i--;
        }
        if (!isDemined) {
            System.out.println("BOOM");
        }
    }



    static int demoRecursion(int number) {
        if (number == 1) {
            return 1;
        }
        return number * demoRecursion(number - 1);
    }


    static int demoLoopFactorial(int number) {

//        int result = 1;
//        for (int i = 1; i <= number; i++) {
//            result *= i;
//        }
//        return result;

//
//        int result = 1;
//        for (int i = number; i > 0; i--) {
//            result *= i;
//        }
//        return result;

        int result = 1;
        int i = 1;
        while (i <= number) {
            result *= i;
            i++;
        }
        return result;
    }


////    Практика No1:
////    a. вывод только четных с помощью цикла FOR
////    b. вывод только НЕчетных с помощью цикла FOR
//    static void task1() {
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//    }
}
