package lr2;

public class Cat extends Animal{
    String breed;
    String color;
    public Cat(String name, int age, String breed, String color) {
        super(name, age);
        this.breed = breed;
        this.color = color;
    }

    public void lie() {
        System.out.println("Я лежу на подоконнике!");
    }
}
