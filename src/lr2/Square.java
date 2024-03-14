package lr2;

public class Square extends Shape {
    int numOfDifferentSides = 1;

    public Square(int[] sides) {
        super(sides);
    }

    public int getSquare(){
        return sides[0] * sides[0];
    }
}
