public class JaegerTest {

    public static void main(String[] args) {
        Jaeger strike = new Jaeger("Novemberc 2, 2019", "Mark-5", "Australa", 76.2f, 1.850f, 10, 10, 9);
                                    strike.move(5);

        Jaeger gipsy = new Jaeger("July 10, 2017", "Mark-3", "USA", 79.25f, 1.980f, 7,8, 6);
                                    gipsy.move(5);

        System.out.println("Strike traveled " + strike.getDistance() + "km VS Gipsy traveled " + gipsy.getDistance() + "km");
    }

}
