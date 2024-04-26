package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++){
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        System.out.print("Введите число: ");
        int number = in.nextInt();
        List<Integer> integersAfter = filterEvenNumbers(integers, number);

        System.out.println("\nСписок после фильтрации (числа меньше введённого):");
        for (Integer i: integersAfter){
            System.out.println(i);
        }
    }
    public static List<Integer> filterEvenNumbers(List<Integer> list, int num) {
        return list.stream().filter(x -> x < num).collect(Collectors.toList());
    }
}
