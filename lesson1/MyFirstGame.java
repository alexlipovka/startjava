package lesson1;

public class MyFirstGame {
	public static void main(String[] args) {
		int secretX = 76;
		int numberY = 3;

		if(numberY < secretX) {
		while(numberY < secretX) {
			System.out.println("You entered the number is less than what the computer guessed");
			System.out.println(numberY);
			numberY = numberY + 6;
		}
	}	if(numberY > secretX) {
		while(numberY > secretX) {
			System.out.println("You entered the number is more than what the computer guessed");
			System.out.println(numberY);
			numberY = numberY - 1;
		}
	}	if(numberY == secretX){
		System.out.println("You Win");
		System.out.println(numberY);
	}
	}
}