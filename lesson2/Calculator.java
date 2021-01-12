package lesson2;

public class Calculator {
	private int a, b;			// переменные с которыми будут производится действия
	private char operation; // действие
	private int result = 1;
	private boolean restart = true; // для проверки рестарт или завершение
	private String answer; // ответ пользователя 

	public int result(char operation) {
	 	case '+': result = a + b;
	 		break;
	 	case '-': result = a - b;
	 		break;
	 	case '*': result = a * b;
	 		break;
	 	case '/': result = a / b;
	 		break;
	 	case '%': result = a % b;
	 		break;
	 	case '^': while(b >= 1) {
					result = a * a;
					b--;
					} 
	}

	public void calcResult() {
		System.out.println("your result = " + result);	
	}

	public boolean restart(String ansver) {
		if(answer == "y") {
			return true;
		} else false;
	}

	public void setA(int a) {
		a = this.a;
	}

	public int getA() {
		return a;
	}

	public void setB(int b) {
		b = this.b;
	}

	public int getB() {
		return b;
	}
}
