package lr3;

import java.util.Scanner;

public class Example6 {
    public static void m(int x) {
        if (x != 1) {
            m(x / 2);
        }
        System.out.print(x % 2);
    }
    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print("\nЧисло в двоичной системе счисления = ");
        m(num);
        in.close();
    }
}
