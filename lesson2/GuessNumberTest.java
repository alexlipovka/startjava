// package startjava.lesson2.game;

import java.util.Scanner;
import java.util.Random;

import Player.java;
import GuessNumber.java;

public class GuessNumberTest {
    public static void main(String[] args) {
        char playerAnswer;
        Scanner input = new Scanner(System.in);
        System.out.println("input first player name ");
        String pl1_name = input.nextLine();
        System.out.println("input second player name ");
        String pl2_name = input.nextLine();
        System.out.println("First player: "+ pl1_name + "\n"+ "Second player: " + pl2_name);
        System.out.println("Guess the number Start");
        Random randomInt = new Random();
        GuessNumber game = new GuessNumber(pl1_name, pl2_name, input);
        
        do {
            game.setGuessNumber(randomInt.nextInt(101));
            game.getWin();
        //      System.ougetInputNumber() != game.getGuessNumber() && player2.getInputNumber() != game.getGuessNumber());
             System.out.println("want to use the program again? enter y / n ");
                do {
                    playerAnswer = input.next().charAt(0);
                    if(playerAnswer == 'n' || playerAnswer == 'y') {
                        break;
                    } else System.out.println("you entered an invalid value, please try again");
                } while(playerAnswer != 'y' && playerAnswer != 'n');
        } while(playerAnswer == 'y');
        input.close();
    }

}