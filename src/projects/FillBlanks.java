import java.util.Scanner;

public class FillBlanks {
    public static void main(String[] args){
        /* GET USER INPUT
         * SEASON OF THE YEAR
         * WHOLE NUMBER
         * ADJECTIVE
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Season of the Year: ");
        String season = scan.next();
        System.out.println("\nIt's "+season+" time!\n***");
        
        System.out.println("Input a random number: ");
        int numCoffee = scan.nextInt();
        System.out.println("\nI count "+season+"!\n***");

        System.out.println("Input an adjective: ");
        String adjective = scan.next();
        System.out.println("\nWow, that's "+adjective+"!\n***");

        System.out.println("Story time...");
        System.out.println("On a "+adjective+" "+season+" day, I drank like "+numCoffee+" cups of coffee.");
    }
}
