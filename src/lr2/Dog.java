package lr2;

public class Dog extends Animal {
    String breed;
    String eatType;
    public Dog(String name, int age, String breed, String eatType) {
        super(name, age);
        this.breed = breed;
        this.eatType = eatType;
    }

    public void walk() {
        System.out.println("Я бегу по полю и виляю хвостом!");
    }
}
