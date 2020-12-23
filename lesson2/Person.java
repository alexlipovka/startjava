public class Person {
	
	String name = "Bill";
	String heirColor = "white";
	int age = 65;
	float weight = 75f;
	float height = 175f;
	char sex = 'M';
	
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
	}
}