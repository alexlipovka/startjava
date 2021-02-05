import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        char playerAnswer;
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        do {
            System.out.println("Enter first number");
            calc.setA(scan.nextInt());

            System.out.println("Enter operation:");
            char operation = scan.next().charAt(0);
            calc.setOperation(operation);

            System.out.println("Enter second number");
            calc.setB(scan.nextInt());
            calc.calculate();
            scan.reset();

            System.out.println("want to use the program again? enter y / n ");
            do {
                playerAnswer = scan.next().charAt(0);
                if(playerAnswer != 'y' && playerAnswer != 'n') {
                    System.out.println("you entered an invalid value, please try again");
                }
            } while(playerAnswer != 'y' && playerAnswer != 'n');
        } while(playerAnswer == 'y');
        scan.close();
    }
}