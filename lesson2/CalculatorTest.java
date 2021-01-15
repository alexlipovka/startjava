package lesson2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         do {
            System.out.println("Enter first number");
                if(in.hasNextInt()) {
                    int z = in.nextInt();
                    System.out.println("your input " +  z);
                }
        } while (!in.hasNextInt());

    }

}   