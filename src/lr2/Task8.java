package lr2;

public class Task8 {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", 4, "Самоед", "Мясо");
        Cat cat = new Cat("Рыжик", 5, "Шотландец", "Шоколадный");
        Bird bird = new Bird("Ряба", 1, "Зерно", "Белая");

        dog.playSound("Гав!");
        dog.walk();

        cat.playSound("Мяу!");
        cat.lie();

        bird.playSound("Кукареку!");
        bird.fly();
    }
}
