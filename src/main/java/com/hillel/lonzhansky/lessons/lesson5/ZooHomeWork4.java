package com.hillel.lonzhansky.lessons.lesson5;

public class ZooHomeWork4 {
    public static void main(String[] args) {

        int min = 2;
        int max = 29;

        int bears = getRandomNumber(min, max);
        int tigers = getRandomNumber(min, max);
        int parrots = getRandomNumber(min, max);
        int elephants = getRandomNumber(min, max);
        int raccoons = getRandomNumber(min, max);
        int lions = getRandomNumber(min, max);

        System.out.println("bears = " + bears);
        System.out.println("tigers = " + tigers);
        System.out.println("parrots = " + parrots);
        System.out.println("elephants = " + elephants);
        System.out.println("raccoons = " + raccoons);
        System.out.println("lions = " + lions);

        int countAnimals = countAnimals(bears, tigers, parrots, elephants, raccoons);
        System.out.println("count animals = " + countAnimals);

        int countAnimalsNextYear = countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons);
        System.out.println("count animals next year = " + countAnimalsNextYear);

        int countAnimalsNextYearWithLions = countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons, lions);
        System.out.println("count animals next year = " + countAnimalsNextYearWithLions);


    }

    static int getRandomNumber(int min, int max) {
        int result = min + (int) (Math.random() * max);
        return result;
    }

    static int countAnimals(int bears, int tigers, int parrots, int elephants, int raccoons) {
        int result = bears + tigers + parrots + elephants + raccoons;
        return result;
    }

    public static int countAnimalsNextYear(int bears, int tigers, int parrots, int elephants, int raccoons) {
        int result = (int) (bears * 1.3)
                + (int) (tigers * 1.2)
                + (int) (parrots * 1.4)
                + (int) (elephants * 1.05)
                + (int) (raccoons * 1.8);
        return result;
    }

    public static int countAnimalsNextYear(int bears, int tigers, int parrots, int elephants, int raccoons, int lions) {
        int result = countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons) + (int) (lions * 1.6);
        return result;
    }

}
