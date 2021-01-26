public class Jaeger {
    private String launched;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strenght;
    private int armor;
    private String equipment;
    private String energyCore;
    private String weapon;
    private String bodyL;
    private String powerMove;
    private int distance;

    public Jaeger(String launched, String mark, String origin, float height, float weight, int speed,
                  int strenght, int armor) {
        this.launched = launched;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strenght = strenght;
        this.armor = armor;

    }

    public void move(int time) {
        distance = speed * time;
    }

    public String getLaunched() {
        return launched;
    }

    public void setLaunched(String launched) {
        this.launched = launched;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getEnergyCore() {
        return energyCore;
    }

    public void setEnergyCore(String energyCore) {
        this.energyCore = energyCore;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getBodyL() {
        return bodyL;
    }

    public void setBodyL(String bodyL) {
        this.bodyL = bodyL;
    }

    public String getPowerMove() {
        return powerMove;
    }

    public void setPowerMove(String powerMove) {
        this.powerMove = powerMove;
    }

    public int getDistance() {
        return distance;
    }

}