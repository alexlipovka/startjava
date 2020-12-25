public class Person {

	String name = "Bill";
	String heirColor = "white";
	int age = 65;
	float weight = 75f;
	float height = 175f;
	char sex = 'M';

	void go() {
		System.out.println(name + " go");
	}

	boolean sit() {
		return true;
	}

	String talk() {
		String talk = "Hello!";
		return talk;
	}

   void run() {
		System.out.println("I'm old for this");

	}

	void learnJava() {
		System.out.println("Bill is studying Java");

	}

/* Bill все равно поедет на рыбалку
	когда будет хорошая погода
	public void hello() {
		System.out.println("Hello!");
	}
	public boolean toFish() {
		if (goodWeather == true) {
			return true;
		} else {
			return false;
		}
	}
		public void bye() {
		System.out.println("see you soon");
	}
		public String say(String aWord) {
		String answerBill = "Ok, no problem" + aWord;
		return answerBill;
	}*/
}
