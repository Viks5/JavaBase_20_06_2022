package com.hillel.lonzhansky.lessons.lesson6;

import java.util.Scanner;

public class CounterStrikeHomework5 {
    public static void main(String[] args) {

        String team1Name, team2Name;
        int team1player1 = 0, team1player2 = 0, team1player3, team1player4,team1player5,
                team2player1,team2player2, team2player3,team2player4, team2player5;

        Scanner scanner = new Scanner(System.in);




//        System.out.println("Please enter count frags");
//        if (!scanner.hasNextInt()) {
//            System.out.println("Wrong data. Please try again");
//            System.exit(0);
//        }
//        team1player1 = scanner.nextInt();

//        if (scanner.hasNextInt()) {
//            team1player1 = scanner.nextInt();
//        } else {
//            System.out.println("Wrong data. Please try again");
//            System.exit(0);
//        }
//        if (scanner.hasNextInt()) {
//            team1player2 = scanner.nextInt();
//        } else {
//            System.out.println("Wrong data. Please try again");
//            System.exit(0);
//        }
        System.out.println("Enter team1 name");
        team1Name = scanner.nextLine();
        team1player1 = getFrags(scanner, 1);
        team1player2 = getFrags(scanner, 2);
        team1player3 = getFrags(scanner, 3);
        team1player4 = getFrags(scanner, 4);
        team1player5 = getFrags(scanner, 5);
        System.out.println("Enter team2 name");
        team2Name = scanner.nextLine();
        team2player1 = getFrags(scanner, 1);
        team2player2 = getFrags(scanner, 2);
        team2player3 = getFrags(scanner, 3);
        team2player4 = getFrags(scanner, 4);
        team2player5 = getFrags(scanner, 5);

        double avgTeam1 = (double)(team1player1 + team1player2 + team1player3 + team1player4 + team1player5) / 5;
        double avgTeam2 = (double)(team2player1 + team2player2 + team2player3 + team2player4 + team2player5) / 5;

        System.out.println("avg team 1 = " + avgTeam1);
        System.out.println("avg team 2 = " + avgTeam2);


        if (avgTeam1 > avgTeam2) {
            System.out.println("win team " + team1Name);
        } else if (avgTeam1 < avgTeam2) {
            System.out.println("win team " + team2Name);
        } else {
            System.out.println("draw");
        }
    }

    static int getFrags(Scanner scanner, int numberPlayer) {
        int temp = 0;

        while (true) {
            System.out.println("Please enter count frags for player: " + numberPlayer);
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                break;
            } else {
                System.out.println("Wrong data. Please try again");
                scanner.next();
            }
        }

        return temp;
    }
}
