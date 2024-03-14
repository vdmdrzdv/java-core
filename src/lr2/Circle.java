package lr2;

public class Circle implements Specifications {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
