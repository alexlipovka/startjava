package lesson1;

public class ConditionalStatement {
	public static void main(String[] args) {

		int age = 25;
		if (age > 20) {
    		System.out.println("age over 20");
		}
		char gender = 'Z';
		if (gender == 'M') {
    		System.out.println("gender male");
		}

		if(gender != 'M') {
    		System.out.println("gender female");
		}
		float height = 1.75f;
		if (height < 1.80) {
  			System.out.println("height less 1.80");
		} 
		else {
    		System.out.println("height more 1.80");
		}
		char aName = 'Z';
		if (aName == 'M') {
   		System.out.println("the first letter of your name M");
		}
 		else if (aName == 'I') {
    		System.out.println("the first letter of your name I");
		}
		 else {
    		System.out.println("the first letter of your name " + aName);
		} 
	}
}