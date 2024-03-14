package lr2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите размер массива (количество строк): ");
        int numLine = id.nextInt();
        System.out.print("Введите размер массива (количество столбцов): ");
        int numColumn = id.nextInt();
        System.out.println("Размер массива равен " + numLine + "x" + numColumn);
        int[][] nums = new int[numLine][numColumn];
        Random random = new Random();

        for (int i = 0; i < numLine; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numColumn; j++) {
                    nums[i][j] = random.nextInt(200);
                    System.out.println("Элемент массива [" + i + "][" + j + "] = " + nums[i][j]);
                }
            } else {
                for (int j = numColumn - 1; j >= 0; j--) {
                    nums[i][j] = random.nextInt(200);
                    System.out.println("Элемент массива [" + i + "][" + j + "] = " + nums[i][j]);
                }
            }
        }
    }
}
