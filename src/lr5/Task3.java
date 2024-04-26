package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String string = "Я строка, в Которой некоторые слова Начинаются с Большой буквы";
        List<String> strings = List.of(string.split(" "));
        System.out.println("Строка после сплитования:");
        for (String line: strings) {
            System.out.println(line);
        }
        List<String> stringsAfter = filterCapitalizedStrings(strings);

        System.out.println("\n" + "Строка после преобразования:");
        for (String line: stringsAfter) {
            System.out.println(line);
        }
    }
    public static List<String> filterCapitalizedStrings(List<String> list) {
        return list.stream().filter(s -> Character.isUpperCase(s.charAt(0))).collect(Collectors.toList());
    }
}
