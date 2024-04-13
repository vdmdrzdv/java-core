package lr4;
public class Example8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("1");
        } finally {
            System.out.println("2");
        }
        return 100;
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
