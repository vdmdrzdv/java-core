package lr7;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Task1_3 {
    public static void main(String[] args) {
        String fileName = "src/lr7/example_file.txt";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String data = in.nextLine();
        in.close();

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (FileReader reader = new FileReader(fileName)) {
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer, 0, charRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        if (new File(fileName).delete()) {
            System.out.println("Файл удален: " + fileName);
        } else {
            System.out.println("Не удалось удалить файл: " + fileName);
        }
    }
}
