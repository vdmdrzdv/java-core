package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        while (true) {
            System.out.print("Введите номер столбца (от 1 до " + matrix[0].length + "): ");
            try {
                int columnNumber = in.nextInt();

                System.out.println("Столбец с номером " + columnNumber + ":");
                for (int[] ints : matrix) {
                    System.out.println(ints[columnNumber - 1]);
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введена строка вместо числа (" + e + ")");
                System.out.println("Повторите попытку\n");
                in.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: столбца с данным номером не существует (" + e + ")");
                System.out.println("Повторите попытку\n");
            }
        }
        in.close();
    }
}
