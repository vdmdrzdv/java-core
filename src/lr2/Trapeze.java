package lr2;

public class Trapeze extends Shape {
    float height;
    float midline;

    public Trapeze(int[] sides, float height, float midline) {
        super(sides);
        this.height = height;
        this.midline = midline;
    }

    public float getSquare() {
        return midline * height;
    }
}
