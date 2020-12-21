package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int num, num1, num2, num3, guess;

//        4
        System.out.println("Task 4");
        int int_var = 5;
        int sum_var = 12 + 20;
        float float_var = 5.7f;

//        5
        System.out.println("Task 5");
        int a, b, sum, multiply ;
        System.out.print("Please enter a number: ");
        a = s.nextInt();
        System.out.print("Please enter b number: ");
        b = s.nextInt();
        sum = a + b;
        System.out.println(String.format("a + b = %d", sum ));
        multiply = a * b;
        System.out.println(String.format("a * b = %d", multiply ));

//        6
        System.out.println("Task 6");
        String color;
        System.out.print("Please your favorite color: ");
        color = s.next();

//        7
        System.out.println("Task 7");
        String name;
        System.out.print("Please, enter your name: ");
        name = s.next();
        System.out.println(name + " Hello! Welcome to Java!");

//        8
        System.out.println("Task 8");
        int year = 2020;
        year += 10;
        year -= 30;
        System.out.println(String.format("year: %d", year ));

//        9
        System.out.println("Task 9");
        System.out.println("Please enter three numbers: ");
         num1 = s.nextInt();
         num2 = s.nextInt();
         num3 = s.nextInt();
        System.out.println("Average is " + (num1 + num2 + num3)/3);

//        10
        System.out.println("Task 10");
        System.out.print("Please enter your travel speed: ");
        int speed = s.nextInt();
        if (speed > 120) {
            System.out.println("Too Fast!");
        } else if (speed < 80){
            System.out.println("Too Slow!");
        } else {
            System.out.println("You are good driver!");
        }

//        11
        System.out.println("Task 11");
        System.out.print("How old is Dan? ");
        int dan_age = s.nextInt();
        System.out.print("How old is Tom? ");
        int tom_age = s.nextInt();

        if (dan_age > tom_age){
            System.out.println("Dan is older");
        } else if ( dan_age < tom_age){
            System.out.println("Tom is older");
        } else {
            System.out.println("Dan and Tom are the same age");
        }

//        12
        System.out.println("Task 12");
        System.out.println("Please enter two numbers");
        num1 = s.nextInt();
        num2 = s.nextInt();
        if (num1 == num2){
            System.out.println("Equal");
        } else if (num1 < num2){
            System.out.println(String.format("Number %d is smaller", num1 ));
        } else {
            System.out.println(String.format("Number %d is smaller", num2 ));
        }

//        13
        System.out.println("Task 13");
        System.out.println("Please enter three numbers");
        num1 = s.nextInt();
        num2 = s.nextInt();
        num3 = s.nextInt();
        if (num1 != num2 && num1 != num3 && num2 != num3){
            if (num1 > num2 && num2 > num3 || num1 < num2 && num2 < num3){
                System.out.println(String.format("Number %d is middle", num2 ));
            } else if (num2 > num3 && num3 > num1 || num2 < num3 && num3 < num1){
                System.out.println(String.format("Number %d is middle", num3 ));
            } else {
                System.out.println(String.format("Number %d is middle", num1 ));
            }
        } else {
            System.out.println("Error! Same numbers..");
        }

//        14
        System.out.println("Task 14");
        System.out.println("Please enter two numbers");
        num1 = s.nextInt();
        num2 = s.nextInt();
        if (num1 != num2){
            if (num1 < num2){
                System.out.println(String.format("%d %d", num1, num2 ));
            } else {
                System.out.println(String.format("%d %d", num2, num1 ));
            }
        } else {
            System.out.println("Numbers are equal");
        }

//        15
        System.out.println("Task 15");
        for (int i = 0; i <= 10; i++){
            System.out.print(i + " ");
        }
//        16
        System.out.println("Task 16");
        for (int i = 1; i <= 50; i += 2){
            System.out.print(i + " ");
        }

//        17
        System.out.println("Task 17");
        do {
            guess = r.nextInt(20) + 10;
            System.out.print(guess + " ");
        } while (guess != 15);

//        18
        System.out.println("Task 18");
        System.out.print("Please enter number from 1-3:");
        num = s.nextInt();
        if (num == 1 || num == 2 || num == 3){
            switch (num){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
            }
        } else {
            System.out.println("Error... unknown number");
        }

//        19
        System.out.println("Task 19");
        int counter = 0;
        do{
            System.out.println("Please enter the number");
            num = s.nextInt();
            counter ++;
        } while (num != 0);
        System.out.println(String.format("You entered %d numbers ", counter));

//        20
        System.out.println("Task 20");
        System.out.print("Please enter the 3-digit number");
        num = s.nextInt();
        int hundreds_digit = num/100;
        System.out.println(String.format("There are %d hundreds in the number %d", hundreds_digit, num));

    }
}
