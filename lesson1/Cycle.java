package lesson1;

/*Создайте класс Cycle с методом main
Выведите на консоль с помощью цикла for все числа от [0, 20]
Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль*/

public class Cycle {
	public static void main(String[] args) {
		System.out.println("Выведите на консоль с помощью цикла for все числа от [0, 20]");
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
		System.out.println("Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)");
		int z = 6;
		while(z >= -6) {
			System.out.println(z);
			z = z -2;
		}

		System.out.println("Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль");
		int a = 10;
		int x = 0;
		do{
			a = ++a;
			if(a % 2 != 0){
				x = x + a;
			}
			}
		while(a <= 20);
		
			System.out.println(x);
	}
}