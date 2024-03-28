package lr3;
import java.util.Scanner;
public class Example7 {
    public static void input(int[] array, int size) {
        size -= 1;
        if (size != 0) { input(array, size); }
        System.out.print("Введите число для ячейки с индексом " + size + ": ");
        Scanner in = new Scanner(System.in);
        array[size] = in.nextInt();
        in.close();
    }
    public static void output(int[] array, int size) {
        size -= 1;
        if (size != 0) { output(array, size); }
        System.out.print(array[size] + " ");
    }
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        input(array, size);
        System.out.println("\nИтоговый массив");
        output(array, size);
        in.close();
    }
}
