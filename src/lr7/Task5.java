package lr7;

import java.io.File;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Название файла: ");
        String fileName = in.nextLine();

        File file = new File("src/lr7/" + fileName);

        if (file.exists()) {
            long fileSize = file.length();
            System.out.println("Размер файла " + fileName + ": " + fileSize + " байт");
        } else {
            System.out.println("Файл не найден.");
        }

        in.close();
    }
}
