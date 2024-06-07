package lr8.example4;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ParseExcelPro {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите полный путь до файла: ");
                String filePath = in.nextLine();
                FileInputStream inputStream = new FileInputStream(filePath);
                XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

                System.out.print("Введите название листа, который вы хотите прочитать: ");
                String list = in.nextLine();
                XSSFSheet sheet = workbook.getSheet(list);

                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + "\t");
                    }
                    System.out.println();
                }

                workbook.close();
                inputStream.close();
                break;
            }
            catch (IOException e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Обратите внимание, что требуется ввести полный путь до файла, начиная с папки src, повторите попытку");
                System.out.print("Если хотите выйти из программы, введите 'выход', иначе нажмите Enter: ");
                if (in.nextLine().equals("выход")) {
                    break;
                }
            }
            catch (NullPointerException e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Листа с таким именем не найдено, повторите попытку");
                System.out.print("Если хотите выйти из программы, введите 'выход', иначе нажмите Enter: ");
                if (in.nextLine().equals("выход")) {
                    break;
                }
            }
        }
    }
}
