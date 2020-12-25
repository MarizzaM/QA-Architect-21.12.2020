package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int num, num1, num2, num3, guess;

//        21
        System.out.println("Task 21");
        int sum = 0;
        int counter = 0;
        while (true){
            System.out.print("Please enter guess: ");
            guess = s.nextInt();
            if (guess == -1){
                System.out.println("You entered number -1... bye");
                break;
            }
            sum += guess;
            counter++;
        }
        System.out.println("Avarage: " + sum/counter);

//        22
        System.out.println("Task 22");
        System.out.print("Please enter number: ");
        int factorial = 1;
        num = s.nextInt();
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println(String.format("Factorial %d! = %d", num, factorial ));

//        23
        System.out.println("Task 23");
        int max = 0;

        while (true){
            System.out.print("Please enter positive number: ");
            num = s.nextInt();
            if (num < 0){
                System.out.println("You entered a negative number");
                break;
            }
            if (num > max){
                max = num;
            }
        }
        System.out.println(String.format("The largest number: %d", max));

//        24
        System.out.println("Task 24");
        System.out.print("Please enter the length of the dashed line (in characters): ");
        num = s.nextInt();
        if (num > 0){
            String line = "";
            for (int i = 1; i <= num; i++){
                line += "-";
            }
            System.out.println(line);
        }
        else {
            System.out.println("Error!!! Length cannot be zero or negative!");
        }

//        25
        System.out.println("Task 25");
        int count_of_visitors = 0, count_sent_home = 0;
        while (true){
            System.out.println("Please enter the temperature of the visitor");
            System.out.println("(for statistics enter)");
            float temperature = s.nextFloat();
            if (temperature != -1 && temperature <= 37){
                System.out.println("Welcome!");
                count_of_visitors++;
            } else if (temperature != -1){
                System.out.println("Sorry, you cannot enter");
                count_sent_home++;
            }
            if (temperature == -1){
                System.out.println(String.format("The number of visitors who entered %d", count_of_visitors));
                System.out.println(String.format("The number of visitors sent home %d", count_sent_home));
                break;
            }
        }
//        //        26
        int match = 0;
        System.out.println("Task 26");
        int[] guess_user = new int [3];
        int[] guess_lotto = new int [3];

        System.out.println("Please enter 3 guess: ");
        for (int i = 0; i <= guess_user.length-1; i++ ){
            guess_user[i] = s.nextInt();
        }
        for (int j = 0; j <= guess_lotto.length-1; j++ ){
            guess_lotto[j] = r.nextInt(100)+1;
        }
        for (int i = 0; i <= guess_user.length-1; i++){
            for (int j = 0; j <= guess_lotto.length-1; j++ ){
                if (guess_user[i] == guess_lotto[j]){
                    match++;
                    guess_lotto[j] = 0;
                }
            }
        }
        if (match == 3){
            System.out.println("Congratulations! You won: 1 000 000 ₪");
        } else if (match == 2){
            System.out.println("Congratulations! You won: 1 000 ₪");
        } else if (match == 1){
            System.out.println("Congratulations! You won: 1 000 ₪");
        } else {
            System.out.println("Try again! Hope next time you'll have more luck");
        }

//        27
        System.out.println("Task 27");
        double netto = 0d, mas = 0d;
        System.out.print("Please enter employee hourly rate: ");
        float hourly_rate = s.nextFloat();
        System.out.print("Please enter the number of working hours of the employee: ");
        float hours = s.nextFloat();

        float salary = hourly_rate * hours;
        if (salary < 1000){
            netto = salary - salary * 0.02;
        } else if (salary >= 1000 && salary <= 5000){
            netto = salary - salary * 0.1;
        } else {
            netto = salary - salary * 0.2;
        }
        System.out.println("The employee's monthly salary is " + netto + " ₪");

    }
}
