package lr8.example3;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HtmlParserPro {
    public static void main(String[] args) {
        String fileName = "src/lr8/example3/news.txt";
        final String url = "http://fat.urfu.ru/index.html";
        for (int attempt = 0; attempt < 3; attempt++) {
            try (BufferedWriter file = new BufferedWriter(new FileWriter(fileName))) {
                Connection.Response response = Jsoup.connect(url)
                        .timeout(5000)
                        .ignoreHttpErrors(true)
                        .execute();
                int statusCode = response.statusCode();
                if (statusCode == 200) {
                    Document doc = Jsoup.connect(url).get();
                    Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > tr > td:nth-child(1)");
                    for (int i = 3; i < 20; i++) {
                        if (!(i % 2 == 0)) {
                            List<Node> nodes = newsParent.get(0).childNodes();
                            System.out.println("Тема: " + ((Element)nodes.get(i)).getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0));
                            file.write("Тема: " + (((Element) nodes.get(i)).getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0) + "\n"));

                            System.out.println("Дата: " + ((Element) nodes.get(i)).getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0) + "\n");
                            file.write("Дата: " + (((Element) nodes.get(i)).getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0) + "\n\n"));
                        }
                    }
                    break;
                } else {
                    System.out.println("Упс, что то пошло не так, код ошибки: " + statusCode);
                    System.out.println("Попытка повторного подключения...");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
