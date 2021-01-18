import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean choice = false;
        Calculator calc = new Calculator();
        while(choice == false) {
            Scanner in1 = new Scanner(System.in);
            System.out.println("Enter first number");
                if(in1.hasNextInt()) {
                    choice = true;
                    calc.setA(in1.nextInt());
                    System.out.println("you input " + calc.getA());
                    in1.reset();
                    in1.close();
                    break;
                } else {
                    System.out.println("you entered an invalid value");
                }
        }

        while(choice == true) {
            Scanner inO = new Scanner(System.in);
                System.out.println("Enter operation:");
                    if(inO.hasNextLine()) {
                        char o = inO.next().charAt(0);
                        calc.setOperation(o);
                        System.out.println("you input " +  o);
                        inO.reset();
                        inO.close();
                        choice = false;
                        break;
                    } else {
                        System.out.println("you entered an invalid value");
                    }
        }
        
        while(choice == false) {
            Scanner in2 = new Scanner(System.in);
                System.out.println("Enter second number");
                    if(in2.hasNextInt()) {
                        choice = false;
                        int x = in2.nextInt();
                        calc.setB(x);
                        System.out.println("you input " +  x);
                        in2.reset();
                        in2.close();
                        break;
                    } else {
                        System.out.println("you entered an invalid value");
                    }
        }

        

    }

}   