package com.guessing_games;

import java.util.Random;
import java.util.Scanner;

public class GuessingGames {
    private int randomizeNumbers(){
        Random rand = new Random();
        return rand.nextInt(100);

    }

    public void getRandomizeNumber(){
        boolean condition = true;
        int getNumber = randomizeNumbers();
        Scanner newScanner = new Scanner(System.in);
        while(condition == true){
            int input = newScanner.nextInt();
            if(input == getNumber){
                System.out.println("you guessed right number");
                condition = false;
            } else if (input > getNumber ) {
                System.out.println("guess lower");
            }
            else {
                System.out.println("guess higher");
            }
        }
    }


}
