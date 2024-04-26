package lr5;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task7 {
    public static List<String> filterStringsByLength(List<String> inputList, int minLength) {
        return inputList.stream()
                .filter(str -> str.length() > minLength)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String string = "Я строка, в Которой некоторые слова Начинаются с Большой буквы";
        List<String> inputList = List.of(string.split(" "));
        System.out.println("Строка после сплитования:");
        for (String line: inputList) {
            System.out.println(line);
        }

        System.out.print("\nВведите минимальную длину строки: ");
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();

        List<String> filteredList = filterStringsByLength(inputList, min);
        System.out.println("\nСтрока после фильтрования:");
        for (String line: filteredList) {
            System.out.println(line);
        }
    }
}
