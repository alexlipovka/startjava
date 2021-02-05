import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player player1 = new Player(input.nextLine());
        Player player2 = new Player(input.nextLine());
        System.out.println("Первый игрок "+ player1.getName() + " "+ "Второй игрок " + player2.getName());

        System.out.println("угадайте число");
        Random randomInt = new Random();
        //int answer = randomInt.nextInt(101);
        randomInt.setAnswer(randomInt.nextInt(101)); // и херли надо то, еще один класс лепить чтоль
    }
}