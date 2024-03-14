package lr2;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void playSound(String sound) {
        System.out.println(sound);
    }
}
