package lesson2;

import java.util.Scanner;

public class GuessNumber {
    private int guessNumber;
    
    Player player1;
    Player player2;
    Scanner input;
    
    public GuessNumber(String pl1_name, String pl2_name, Scanner input) {
        this.player1 = new Player(pl1_name);
        this.player2 = new Player(pl2_name);
        this.input = input;
    }
    
    public void setGuessNumber(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    public int getGuessNumber() {
        return guessNumber;
    }
    
    public void getWin() {
        // System.out.println("Hello! First player "+ player1.getName() + " "+ "second player " + player2.getName());
        do {
            System.out.println(player1.getName() + " guess the number from 0 to 100");
            player1.setInputNumber(input.nextInt());
            if(player1.getInputNumber() == guessNumber) {
                System.out.println(player1.getName() + " Win!");
                break;             
            } else if(player1.getInputNumber() < guessNumber) {
                System.out.println("\tyour number is less than the guesswork");
            } else if(player1.getInputNumber() > guessNumber) {
                System.out.println("\tyour number is greater than the envisioned");
            }
    
            System.out.println(player2.getName() + " guess the number from 0 to 100");
            player2.setInputNumber(input.nextInt());
            if(player2.getInputNumber() == guessNumber) {
                System.out.println(player2.getName() + " Win!");
                break;
            } else if(player2.getInputNumber() < guessNumber) {
                System.out.println("\tyour number is less than the guesswork");
            } else if(player2.getInputNumber()> guessNumber) {
                System.out.println("\tyour number is greater than the envisioned");
            } 
        } while (player1.getInputNumber() != guessNumber && player2.getInputNumber() != guessNumber);
    }
}