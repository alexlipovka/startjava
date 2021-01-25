import java.util.Scanner;

public class CalculatorTest {   
    public static void main(String[] args) {
        boolean cycleAnsver;
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        do {
            System.out.println("Enter first number");
            calc.setA(scan.nextInt());

            System.out.println("Enter operation:");
            char o = scan.next().charAt(0);
            calc.setOperation(o);

            System.out.println("Enter second number");
            calc.setB(scan.nextInt());
            calc.setResult(o);
            calc.printResult();
            scan.reset();
            
            System.out.println("want to use the program again? enter y / n ");
            do {
                char yourAnsver = scan.next().charAt(0);
                if(yourAnsver == 'y') {
                    cycleAnsver = false;
                    calc.setRestart(yourAnsver);
                    System.out.println("You have chosen: continue");
                    break;
                } else if(yourAnsver == 'n') {
                    cycleAnsver = false;
                    calc.setRestart(yourAnsver);
                    System.out.println("You have chosen: to stop");
                    break;
                } else {
                    System.out.println("you entered an invalid value, please try again");
                    cycleAnsver = true;
                }
            } while(cycleAnsver == true);
        } while(calc.getRestart() == true);
        scan.close();
    } 
}

