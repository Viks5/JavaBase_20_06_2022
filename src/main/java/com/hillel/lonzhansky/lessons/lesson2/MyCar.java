package com.hillel.lonzhansky.lessons.lesson2;

public class MyCar {
    public static void main(String[] args) {
        String name = "BMW";
        char category = 'B';
        byte wheels = 4;
        short passengers = 5;
        int number = 5544;
        long phone = 30934035220L;
        float price = 15_000.500F;
        double radio = 106.5;


        double fuel = 50;

        System.out.println("name car: " + name);
        System.out.println("category: " + category);
        System.out.println("wheels quantity: " + wheels);
        System.out.println("passengers quantity: " + passengers);
        System.out.println("passengers quantity: " + passengers);
        System.out.println("number: " + number);
        System.out.println("owner phone number: " + phone);
        System.out.println("price: " + price);
        System.out.println("radio: " + radio);

        System.out.println("fuel = " + fuel);
        System.out.println("car driving...");
        fuel = fuel - 20;
        System.out.println("fuel = " + fuel);


        /*

        String name2 = "BMW";
        String name3 = "BMW";
        String name4 = "BMW";
         */

//        String name5 = new String("BMW");

    }
}
