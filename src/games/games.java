package games;

import java.util.Scanner;

public class games {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n*** CHOOSE THE GAME YOU WANT TO PLAY BY TYPING THE NUMBER THAT REPRESENTS IT ***\n\n1. Fill in the blanks\n2. Change for a Dollar\n3. Game of Luck: Rolling Dies");
        String choice = scan.next();
        switch(choice){
            case "1": FillBlanks.run(); break;
            case "2": ChangeForDollar.run(); break;
            case "3": RollDies.run(); break;
            default: System.out.println("Invalid input.");
        }
    }
}
