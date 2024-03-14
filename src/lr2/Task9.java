package lr2;

public class Task9 {
    public static void main(String[] args) {
        Square box = new Square(new int[]{3, 3, 3, 3});
        System.out.println("Периметр, рассчитанный методом родительского класса: " + box.getPerimeter());
        System.out.println("Площадь, рассчитанная в классе-наследнике: " + box.getSquare());

        Trapeze trapeze = new Trapeze(new int[]{3, 5, 3, 7}, 2.828f, 6);
        System.out.println("Периметр, рассчитанный методом родительского класса: " + trapeze.getPerimeter());
        System.out.println("Площадь, рассчитанная в классе-наследнике: " + trapeze.getSquare());

    }
}
