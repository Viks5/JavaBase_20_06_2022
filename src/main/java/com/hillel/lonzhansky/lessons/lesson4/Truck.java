package com.hillel.lonzhansky.lessons.lesson4;


//          Практика No2:
//        a. Создать класс Truck
//        b. Добавить параметры length, width, height в main-методе
//        c. Добавить метод countVolume() для расчета объема
//              public static int countVolume(int length, int width, int height) {}
//        d. Вызвать метод countVolume() в main-методе и передать в него параметры
public class Truck {
    public static void main(String[] args) {
        int length = 10;
        int width = 20;
        int height = 30;

        int result = countVolume(length, width, height);
        System.out.println(result);
//        System.out.println(countVolume(length, width, height));
    }

    static int countVolume(int length, int width, int height) {
//        int volume = length * width * height;
//        return volume;

        return length * width * height;
    }
}
