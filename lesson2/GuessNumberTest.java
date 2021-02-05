import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player player1 = new Player(input.nextLine());
        Player player2 = new Player(input.nextLine());
        System.out.println("Первый игрок "+ player1.getName() + " "+ "Первый игрок " + player2.getName());

        System.out.println("угадайте число");
        Random randomInt = new Random();
        final int answer = randomInt.nextInt(101);
        randonInt.setAnswer(answer);
    }
}