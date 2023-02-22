package games;

import java.util.Scanner;

/* DECISION STRUCTURES */
public class ChangeForDollar {

    public static void run(){
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("To win this game, your change must add up to exactly 1$!");

        System.out.println("Enter your number of pennies:");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels:");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes:");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters:");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double sum = (numOfPennies*penny) + (numOfNickels*nickel) + (numOfDimes*dime) + (numOfQuarters*quarter);
        if(sum==dollar){
            System.out.println("YOU WIN!");
        }
        else{
            System.out.println("YOU LOSE...\nYou had "+sum+". :(");
        }
    }
}
