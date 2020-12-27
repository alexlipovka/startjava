public class WolfTest {
  public static void main(String[] args) {
    Wolf wolf1 = new Wolf();

    wolf1.setName("Volchok");
    wolf1.setSex("male");
    wolf1.setWeight(15.7);
    wolf1.setAge(7);
    wolf1.setColor("Pink");
    wolf1.setPrey(0);
   
    System.out.println(wolf1.getName());
    System.out.println(wolf1.getSex());
    System.out.println(wolf1.getWeight());
    System.out.println(wolf1.getAge());
    System.out.println(wolf1.getColor());
    wolf1.run();

    if(wolf1.hunts() == true) {
        System.out.println(wolf1.getName() + " following the trail"); 
        }
    else { 
        System.out.println(wolf1.getName() + " did not find animals");
        }
    System.out.println(wolf1.yowl());
    }
}



