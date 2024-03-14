package lr2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String encryptString = id.nextLine();
        System.out.print("Введите ключ: ");
        int shift = id.nextInt();

        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);
        System.out.println("Текст после преобразования: " + encryptString);

        System.out.print("Выполнить обратное преобразование? (y/n) ");
        String answer = id.nextLine(); // здесь считываем символ переноса строки, оставшийся после nextInt()
        while (true) {
            answer = id.nextLine();
            if (answer.equals("y")) {
                arrayChar = encryptString.toCharArray();
                for (int i = 0; i < arrayChar.length; i++) {
                    arrayInt[i] = arrayChar[i] - shift;
                    arrayCharNew[i] = (char) arrayInt[i];
                }
                encryptString = new String(arrayCharNew);
                System.out.print("Текст после обратного преобразования: " + encryptString);
                break;
            } else if (answer.equals("n")){
                System.out.print("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
    }
}
