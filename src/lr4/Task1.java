package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length;
        int[] array;

        while (true) {
            try {
                System.out.print("Введите длину массива: ");
                length = in.nextInt();
                array = new int[length];
                break;
            } catch (NegativeArraySizeException e) {
                System.out.println("Массив не может иметь отрицательную длину: " + e);
                System.out.println("Повторите попытку\n");
            }
        }

        while (true) {
            try {
                int sum = 0;
                int count = 0;

                for (int i = 0; i < length; i++) {
                    System.out.print("Введите элемент массива " + i + ": ");
                    array[i] = in.nextInt();
                    if (array[i] > 0) {
                        sum += array[i];
                        count++;
                    }
                }

                if (count > 0) {
                    double average = (double) sum / count;
                    System.out.println("Среднее значение среди положительных элементов: " + average);
                    break;
                } else {
                    throw new RuntimeException("в массиве нет положительных элементов");
                }
            } catch (InputMismatchException e) {
                System.out.println("Несоответствующий тип данных (требуется int): " + e);
                System.out.println("Повторите попытку\n");
                in.nextLine();
            } catch (RuntimeException e) {
                System.out.println("Ошибка: " + e);
                System.out.println("Повторите попытку\n");
            }
        }
        in.close();
    }
}
