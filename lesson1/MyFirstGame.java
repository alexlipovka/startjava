package lesson1;

public class MyFirstGame {
	public static void main(String[] args) {
		int secretX = 369;
		int numberY = 30;
		
		while (secretX != numberY) {
		if(numberY < secretX) {
			System.out.println("You entered the number is less than what the computer guessed");
			System.out.println(numberY);
			numberY = numberY + 53;
		} 	if(numberY > secretX) {
			System.out.println("You entered the number is more than what the computer guessed");
			System.out.println(numberY);
			numberY = numberY - 5;
	}}	if(numberY == secretX){
		System.out.println("You Win");
		System.out.println(numberY);
	}
	}
}