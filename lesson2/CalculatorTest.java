import java.util.Scanner;

public class CalculatorTest {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		while(calc.getRestart() == true) {
			
			System.out.println("Enter first number");
			calc.setA(scan.nextInt());

			System.out.println("Enter operation:");
			char o = scan.next().charAt(0);
			calc.setOperation(o);

			System.out.println("Enter second number");
			int x = scan.nextInt();
			calc.setB(x);
			calc.setResult(o);
			calc.printResult();
			scan.reset();
			
			System.out.println("Want you to continue? enter yes / no");
			calc.setAnswer(scan.next());
			if(calc.getAnswer() == "no") {
			
			break;
			} else if(calc.getAnswer() == "yes") {
			//	choice = true;
			} else {
				System.out.println("you entered an invalid value, please try again");
				scan.next();
			}
		} 
	}
}
