package lr2;

public class Task6 {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 6);
        System.out.println("Площадь прямоугольника = " + box.square());
        System.out.println("Периметр прямоугольника = " + box.perimeter());

        Circle wheel = new Circle(5);
        System.out.println("Площадь круга = " + wheel.square());
        System.out.println("Периметр круга = " + wheel.perimeter());

        Triangle mason = new Triangle(3, 4, 5);
        System.out.println("Площадь треугольника = " + mason.square());
        System.out.println("Периметр треугольника = " + mason.perimeter());
    }
}
