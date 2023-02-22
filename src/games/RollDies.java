package games;

import java.util.Random;

public class RollDies {
    public static void run(){

        int board = 20;
        int position = 0;
        int rolls = 0;
        int die = 0;
        
        Random random = new Random();

        System.out.println("\n\n*** THIS IS A GAME TO TEST YOUR LUCK ***\n You win if you manage to reach the end of the board in 5 die rolls.\n---");
        while(position < board && rolls < 5)
        {
            die = random.nextInt(6) + 1;
            position+=die;
            rolls++;
            System.out.println("You rolled a "+die+"!\nYour current position: "+position+"\nYou have rolled "+rolls+" times.\n");
        }
        System.out.println("---");
        if(position>=board){
            System.out.println("YOU WIN! <3");
        }
        else{
            System.out.println("YOU LOSE! :(");
        }
    }
    
}
