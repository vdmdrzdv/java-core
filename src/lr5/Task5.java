package lr5;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task5 {
    public static List<String> filterStrings(List<String> inputList, String substring) {
        return inputList.stream()
                .filter(str -> str.contains(substring))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String string = "Я строка, в Которой некоторые слова Начинаются с Большой буквы";
        List<String> inputList = List.of(string.split(" "));
        System.out.println("Строка после сплитования:");
        for (String line: inputList) {
            System.out.println(line);
        }

        System.out.print("\nВведите подстроку: ");
        Scanner in = new Scanner(System.in);
        String substr = in.nextLine();
        List<String> filteredList = filterStrings(inputList, substr);

        System.out.println("\n" + "Строка после фильтрования:");
        for (String line: filteredList) {
            System.out.println(line);
        }
    }
}
