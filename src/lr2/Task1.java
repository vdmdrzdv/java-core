package lr2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = id.nextInt();
        System.out.println("Размер массива равен " + size);
        int[] nums = new int[size];
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }

        int[] copiedArray = Arrays.copyOf(nums, size);
        Arrays.sort(nums);
        System.out.print("Элемент с минимальным значением: " + nums[0] + ", его индекс(-ы): ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[0] == copiedArray[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
