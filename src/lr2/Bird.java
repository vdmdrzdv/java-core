package lr2;

public class Bird extends Animal {
    String eatType;
    String color;
    public Bird(String name, int age, String eatType, String color) {
        super(name, age);
        this.eatType = eatType;
        this.color = color;
    }

    public void fly() {
        System.out.println("Я летаю!");
    }
}
