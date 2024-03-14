package lr2;

public class Rectangle implements Specifications {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double square() {
        return width * length;
    }

    public double perimeter() {
        return (width + length) * 2;
    }
}
