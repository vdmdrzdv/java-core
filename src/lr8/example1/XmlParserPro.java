package lr8.example1;

import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlParserPro {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lr8/example1/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("film");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("\nТекущий элемент: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Название фильма: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Продюсер: " + element.getElementsByTagName("producer").item(0).getTextContent());
                    System.out.println("Год издания : " + element.getElementsByTagName("year").item(0).getTextContent());
                }
            }

            Scanner in = new Scanner(System.in);
            System.out.print("\nВведите количество фильмов, которые вы хотите добавить: ");
            int num = in.nextInt();
            in.nextLine();
            for (int i = 0; i < num; i++) {
                Element newFilm = doc.createElement("film");
                System.out.print("Введите название фильма: ");
                newFilm.appendChild(addFilm(doc, "title", in.nextLine()));

                System.out.print("Введите продюсера: ");
                newFilm.appendChild(addFilm(doc, "producer", in.nextLine()));

                System.out.print("Введите год: ");
                newFilm.appendChild(addFilm(doc, "year", in.nextLine()));
                doc.getDocumentElement().appendChild(newFilm);
            }

            System.out.print("Введите название или год фильма, который хотите найти: ");
            Node film = findFilm(doc, in.nextLine());
            if (film != null) {
                if (film.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) film;
                    System.out.println("Название фильма: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Продюсер: " + element.getElementsByTagName("producer").item(0).getTextContent());
                    System.out.println("Год издания : " + element.getElementsByTagName("year").item(0).getTextContent());

                    System.out.print("Удалить этот фильм? (да/нет) ");
                    if (in.nextLine().equals("да")) {
                        film.getParentNode().removeChild(film);
                        System.out.println("Фильм удален");
                    }
                }
            } else {
                System.out.println("Фильм не найден.");
            }

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(inputFile);
            transformer.transform(source, result);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Element addFilm(Document doc, String tagName, String textContent) {
        Element element = doc.createElement(tagName);
        element.appendChild(doc.createTextNode(textContent));
        return element;
    }

    public static Node findFilm(Document doc, String info) {
        NodeList nodeList = doc.getElementsByTagName("film");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                if (element.getElementsByTagName("title").item(0).getTextContent().equalsIgnoreCase(info)
                        || element.getElementsByTagName("year").item(0).getTextContent().equalsIgnoreCase(info)) {
                    return node;
                }
            }
        }
        return null;
    }
}