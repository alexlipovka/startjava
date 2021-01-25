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
            do {
                char playerAnswer = scan.next().charAt(0);
                if(calc.getRestart() == true) {
                    calc.setRestart(playerAnswer);
                    System.out.println("You have chosen: continue");
                    break;
                } else if(calc.getRestart() == false) {
                    calc.setRestart(playerAnswer);
                    System.out.println("You have chosen: to stop");
                    break;
                } else {
                    System.out.println("you entered an invalid value, please try again");
                    }
            } while(calc.getRestart() == true);
        } while(calc.getRestart() == true);
        scan.close();
    } 
}

