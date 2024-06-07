package lr8.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.io.FileReader;

public class JsonParserPro {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr8/example2/example.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("films");

            for (Object o : jsonArray) {
                JSONObject film = (JSONObject) o;
                System.out.println("\nТекущий элемент: films");
                System.out.println("Название фильма: " + film.get("title"));
                System.out.println("Продюсер: " + film.get("producer"));
                System.out.println("Год выпуска: " + film.get("year"));
            }

            Scanner in = new Scanner(System.in);
            System.out.print("\nВведите количество фильмов, которые вы хотите добавить: ");
            int num = in.nextInt();
            in.nextLine();
            for (int i = 0; i < num; i++) {
                JSONObject newFilm = new JSONObject();
                System.out.print("\nВведите название фильма: ");
                newFilm.put("title", in.nextLine());

                System.out.print("Введите продюсера: ");
                newFilm.put("producer", in.nextLine());

                System.out.print("Введите год: ");
                newFilm.put("year", in.nextLine());

                jsonArray.add(newFilm);
            }

            boolean find = false;
            System.out.print("\nВведите продюссера для поиска: ");
            String producer = in.nextLine();
            for (Object o : jsonArray) {
                JSONObject item = (JSONObject) o;
                if (item.get("producer").equals(producer)) {
                    System.out.println("\nНайденный фильм:");
                    System.out.println("Название фильма: " + item.get("title"));
                    System.out.println("Продюсер: " + item.get("producer"));
                    System.out.println("Год выпуска: " + item.get("year"));
                    find = true;
                }
            }
            if (!find) {
                System.out.println("Фильм не найден");
            }

            find = false;
            System.out.print("\nВведите название фильма для удаления: ");
            String film = in.nextLine();
            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject item = (JSONObject) iterator.next();
                if (item.get("title").equals(film)) {
                    iterator.remove();
                    System.out.println("Фильм удален");
                    find = true;
                }
            }
            if (!find) {
                System.out.println("Фильм не найден");
            }

            jsonObject.put("films", jsonArray);
            FileWriter file = new FileWriter("src/lr8/example2/example.json");
            file.write(jsonObject.toJSONString());
            file.close();
            System.out.println("JSON-файл успешно дополнен!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
