package lr4;
public class Example12 {
    public static void m(String str, double chislo) {
        try {
            if (str == null) {
                throw new IllegalArgumentException("Строка введена неверно");
            }
            if (chislo > 0.001) {
                throw new IllegalArgumentException("Неверное число");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e);
        }
    }

    public static void main(String[] args) {
        m(null, 0.000001);
    }
}
