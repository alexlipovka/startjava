package lesson2;

public class Wolf {
  
  String sex;
  String name;
  double weight;
  int age;
  String color;
  int prey; // добыча для реализации метода охота

  void go() {
    System.out.println(name + "go");
  }

  void sit() {
    System.out.println(name + "sit");
  }

  void run() {
    System.out.println(name + "run");
  }

  String yowl() {
    String yowl = "ouuuu";
    return yowl;
  }

  boolean hunts() {
    if(prey > 0) {
      return true;
    } else {
      return false;
    }
  }
}
