package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;

        while (true) {
            System.out.print("Введите размер массива: ");
            try {
                size = in.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введена строка вместо числа (" + e + ")");
                System.out.println("Повторите попытку\n");
                in.nextLine();
            }
        }

        byte[] array = new byte[size];
        for (int i = 0; i < size; i++) {
            while (true) {
                System.out.print("Введите элемент массива " + i + ": ");
                try {
                    array[i] = in.nextByte();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: некорректный ввод (" + e + ")");
                    System.out.println("Повторите попытку\n");
                    in.nextLine();
                }
            }
        }
        in.close();

        System.out.print("Сумма элементов массива: ");
        int sum = 0;
        for (byte value : array) {
            try {
                sum += value;
                if (sum < Byte.MIN_VALUE || sum > Byte.MAX_VALUE) {
                    throw new ArithmeticException("вычисление значения за границами диапазона типа byte");
                }
            } catch (ArithmeticException e) {
                System.out.println("\nОшибка: " + e);
                return;
            }
        }

        System.out.println(sum);
    }
}
