import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        char playerAnswer;
        Scanner input = new Scanner(System.in);
        System.out.println("input first player name ");
        Player player1 = new Player(input.nextLine());
        System.out.println("input second player name ");
        Player player2 = new Player(input.nextLine());
        System.out.println("First player "+ player1.getName() + " "+ "second player " + player2.getName());
        System.out.println("Guess the number Start");
        Random randomInt = new Random();
        int answer = randomInt.nextInt(101);
        do {
            do {
                System.out.println(player1.getName() + " guess the number from 0 to 100");
                player1.setInputNumber(input.nextInt());
                if(player1.getInputNumber() == answer) {
                    System.out.println(player1.getName() + " Win!");
                    break;
                } else if(player1.getInputNumber() < answer) {
                    System.out.println("your number is less than the guesswork");
                } else if(player1.getInputNumber() > answer) {
                    System.out.println("your number is greater than the envisioned");
                }

                System.out.println(player2.getName() + " guess the number from 0 to 100");
                player2.setInputNumber(input.nextInt());
                if(player2.getInputNumber() == answer) {
                    System.out.println(player2.getName() + " Win!");
                    break;
                } else if(player2.getInputNumber() < answer) {
                    System.out.println("your number is less than the guesswork");
                } else if(player2.getInputNumber()> answer) {
                    System.out.println("your number is greater than the envisioned");
                } 
            } while (player1.getInputNumber() != answer && player2.getInputNumber() != answer);
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