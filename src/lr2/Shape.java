package lr2;

public class Shape {
    int[] sides;

    public Shape(int[] sides) {
        this.sides = sides;
    }

    public int getPerimeter() {
        int p = 0;
        for (int side:sides) {
            p += side;
        }
        return p;
    }
}
