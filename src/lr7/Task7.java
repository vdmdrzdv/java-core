package lr7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя файла для записи: ");
        String fileName = in.nextLine();

        System.out.print("Введите текст для записи в файл: ");
        String text = in.nextLine();

        try (FileWriter writer = new FileWriter("src/lr7/" + fileName)) {
            writer.write(text);
            System.out.println("Текст успешно записан в файл.");

            int characterCount = text.length();
            System.out.println("Количество записанных символов: " + characterCount);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        in.close();
    }
}
