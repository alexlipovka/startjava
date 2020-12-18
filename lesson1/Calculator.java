package lesson1;

public class Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		char operation = '^';
		int result = 0 ;

		if(operation == '+') {
			result = a + b;
			System.out.println("your result = " + result);
		}
		if(operation == '-') {
			result = a - b;
			System.out.println("your result = " + result);
		}
		if(operation == '*') {
			result = a * b;
			System.out.println("your result = " + result);
		}
		if(operation == '/') {
			result = a / b;
			System.out.println("your result = " + result);
		}
		if(operation == '%') {
			result = a % b;
			System.out.println("your result = " + result);
		}
		if(operation == '^') {
			while(b >= 1) {
				result = a * a + result;
				b--;
				}
			System.out.println("your result = " + result);
			}
	}
}
