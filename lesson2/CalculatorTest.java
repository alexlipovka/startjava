import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
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
            char playerAnswer;
            do {
                playerAnswer = scan.next().charAt(0);
                calc.setAnswer(playerAnswer);
                if(playerAnswer == 'y') {
                    calc.setRestart(playerAnswer);
                } else if(playerAnswer == 'n') {
                    calc.setRestart(playerAnswer);
                } else {
                    System.out.println("you entered an invalid value, please try again");
                }
            } while(calc.getAnswer() != 'y' && calc.getAnswer() != 'n');
        } while(calc.getRestart());
        scan.close();
    }
}
