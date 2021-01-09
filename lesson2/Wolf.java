public class Wolf {

    private String sex;
    private String name;
    private double weight;
    private int age;
    private String color;
    private int prey; // добыча для реализации метода охота

    public void go() {
        System.out.println(name + " go");
    }

    public void sit() {
        System.out.println(name + " sit");
    }

    public void run() {
        System.out.println(name + " run");
    }

    public String yowl() {
        String yowl = "ouuuu";
        return yowl;
    }

    public boolean hunts() {
        if(prey > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
       return name;
    }  
 
    public void setName(String newName) {
        name = newName;
    }

    public String getSex() {
        return sex;
    } 
 
    public void setSex(String variableSex) {
        sex = variableSex;
    }

    public double getWeight() {
        return weight;
    } 
 
    public void setWeight(double numeralWeight) {
        weight = numeralWeight;
    }

    public int getAge() {
        return age;
    } 
 
    public void setAge(int variableAge) {
        if(variableAge > 8) {
          System.out.println("Incorrect age!");
        } else {
            age = variableAge;
        }
    }

    public String getColor() {
        return color;
    } 
 
    public void setColor(String newColor) {
        color = newColor;
    }
  
    public int getPrey() {
        return prey;
    } 
 
    public void setPrey(int amountPrey) {
        prey = amountPrey;
    } 
}