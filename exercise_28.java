package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

//        28
        System.out.println("Task 28");
        System.out.println("Welcome to Rock! Paper! Scissors! game");
        System.out.println("1-rock, 2-paper, 3-scissors");
        System.out.print("Please enter number 1, 2 or 3 ");
        System.out.println("(Enter zero to quit...)");
        int num_user;
        do{
            num_user = s.nextInt();
            int num_comp = r.nextInt(3)+1;
            if (num_user == 1 || num_user == 2 || num_user == 3){
                switch (num_user){
                    case 1:
                        System.out.println("You chose - Rock!");
                        break;
                    case 2:
                        System.out.println("You chose - Paper!");
                        break;
                    case 3:
                        System.out.println("You chose - Scissors!");
                        break;
                }
                switch (num_comp){
                    case 1:
                        System.out.println("Computer chose - Rock!");
                        break;
                    case 2:
                        System.out.println("Computer chose - Paper!");
                        break;
                    case 3:
                        System.out.println("Computer chose - Scissors!");
                        break;
                }
                if (num_user == 1 && num_comp == 1 || num_user == 2 && num_comp == 2 || num_user == 3 && num_comp == 3) {
                    System.out.println("Dead heat...");
                } else if (num_user == 1 && num_comp == 2 || num_user == 2 && num_comp == 3 || num_user == 3 && num_comp == 1) {
                    System.out.println("You lost...");
                } else {
                    System.out.println("Congrats! Yuo won!");
                }
            } else if (num_user !=0){
                System.out.println("Error! Entered wrong number!");
                System.out.println("Please enter number 1, 2 or 3");
            }
        } while (num_user != 0);
        System.out.println("Bye-bye... Please come back soon!");
    }
}
