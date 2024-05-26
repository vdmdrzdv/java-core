package lr7;
import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;
    private String country;

    public Student(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}
public class Task8 {
    public static void main(String[] args) {
        Student student = new Student("Вадим", 23, "Russia");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/lr7/student.ser"))) {
            outputStream.writeObject(student);
            System.out.println("Студент успешно сохранен в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении объекта: " + e.getMessage());
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/lr7/student.ser"))) {
            Student restoredStudent = (Student) inputStream.readObject();
            System.out.println("Студент успешно восстановлен из файла.");
            System.out.println("Имя: " + restoredStudent.getName());
            System.out.println("Возраст: " + restoredStudent.getAge());
            System.out.println("Страна: " + restoredStudent.getCountry());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при восстановлении объекта: " + e.getMessage());
        }
    }
}
