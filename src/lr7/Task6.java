package lr7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя файла: ");
        String fileName = in.nextLine();

        System.out.print("Введите слово для поиска: ");
        String word = in.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/lr7/" + fileName))) {
            String line;
            int lineNumber = 1;

            System.out.println("Строки содержащие слово '" + word + "':");
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    System.out.println("Строка " + lineNumber + ": " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        in.close();
    }
}
