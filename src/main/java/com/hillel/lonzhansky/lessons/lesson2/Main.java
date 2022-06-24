package com.hillel.lonzhansky.lessons.lesson2;

public class Main {
    public static void main(String[] args) {
        byte myByteValue = -128;
        byte myByteValue2;
        myByteValue2 = 10;
        myByteValue2 = 12;


//        var myVariable = 20.22f;


        short shortVariable = 32767;
        int intVariable = 21470005;
        long longVariable = 3495384759834534L;

        float floatVariable = 35.55323232323232F;
        double doubleVariable = 35.5532323232323233454353422;


        System.out.println(myByteValue);
        System.out.println(longVariable);
        System.out.println(floatVariable);
        System.out.println(doubleVariable);


        char charVariant1 = 'A';
        char charVariant2 = 65;
        char charVariant3 = '\u2622';

        System.out.println(charVariant1);
        System.out.println(charVariant2);
        System.out.println(charVariant3);


        String someString = "Hello world  soi fowiwoei rwoierweoi " +
                "rweioryewiryi ewr iewo rweoi rsoi fowiwoei rwoierweoi " +
                "rweioryewiryi ewr iewo rweoi rsoi fowiwoei rwoierweoi " +
                "rweioryewiryi ewr iewo rweoi rsoi fowiwoei rwoierweoi " +
                "rweioryewiryi ewr iewo rweoi rsoi fowiwoei rwoierweoi" +
                " rweioryewiryi ewr iewo rweoi r";

        String someString2 = """
                Hello world  soi fowiwoei rwoierweoi
                     rweioryewiryi ewr iewo rweoi rsoi fowiwoei rwoierweoi 
                      rweioryewiryi ewr iewo rweoi rsoi fowiwoei rwoierweoi 
                      
                      
                      
                      
                rweioryewiryi ewr iewo rweoi rsoi fowiwoei rwoierweoi 
                rweioryewiryi ewr iewo rweoi rsoi fowiwoei rwoierweoi
                 rweioryewiryi ewr iewo rweoi r
                 """;
        System.out.println(someString2);


        boolean booleanVariable = false;
        boolean booleanVariable2 = true;


        byte someByte = 10;
        Byte someByteRef = 10;

        String strNumber = "123";

        byte a = Byte.parseByte(strNumber);

        Integer intRef;
        Character charRef;


    }
}
