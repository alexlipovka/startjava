public class JaegerTest {

	public static void main(String[] args) {
		Jager strike = new Jager();
		strike.setLaunched("Novemberc 2, 2019");
		strike.setMark("Mark-5");
		strike.setOrigin("Australa");
		strike.setSpeed(10);
		strike.setHeight(76.2f);
		strike.setWeight(1.850f);
		strike.setStrenght(10);
		strike.setArmor(9);
		strike.move(5);
		
		Jager gipsy = new Jager();
		gipsy.setLaunched("July 10, 2017");
		gipsy.setMark("Mark-3");
		gipsy.setOrigin("USA");
		gipsy.setSpeed(7);
		gipsy.setHeight(79.25f);
		gipsy.setWeight(1.980f);
		gipsy.setStrenght(8);
		gipsy.setArmor(6);
		gipsy.move(5);
		
		System.out.println("Strike traveled " + strike.getDistance() + "km VS Gipsy traveled " + gipsy.getDistance() + "km");
	}

}
