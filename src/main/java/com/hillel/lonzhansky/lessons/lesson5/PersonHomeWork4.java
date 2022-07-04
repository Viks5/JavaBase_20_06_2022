package com.hillel.lonzhansky.lessons.lesson5;

public class PersonHomeWork4 {
    public static void main(String[] args) {
        String name = "Den";
        String str = personInfo(name, "Lonzhansky", "Kyiv", "380934035220");
        System.out.println(str);

        System.out.println(personInfo("Den", "Lonzhansky", "Kyiv", "380934035220"));
    }

    static String personInfo(String name, String surname, String city, String phoneNumber) {
//        String result = "Позвонить гражданину " + name + " " + surname + " из города" + city + " можно по номеру " + phoneNumber;
////        System.out.println(result);
//        return result;
        return "Позвонить гражданину " + name + " " + surname + " из города" + city + " можно по номеру " + phoneNumber;
    }
}
