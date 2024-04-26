package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        String string = "Я строка, в Котор00й некоторые слов@ Начинаются с Большой5 буквы";
        List<String> strings = List.of(string.split(" "));
        System.out.println("Строка после сплитования:");
        for (String line: strings) {
            System.out.println(line);
        }
        List<String> stringsAfter = filterLettersStrings(strings);

        System.out.println("\n" + "Строка после преобразования:");
        for (String line: stringsAfter) {
            System.out.println(line);
        }
    }
    public static List<String> filterLettersStrings(List<String> list) {
        return list.stream()
                .filter(str -> str.chars().allMatch(Character::isLetter))
                .collect(Collectors.toList());
    }
}
