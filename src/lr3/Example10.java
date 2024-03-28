package lr3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Example10 {
    public static void drop(List<String> collect){
        int i = 0;
        while (collect.size() > 1) {
            collect.remove(i);
            i = (i + 1) % collect.size();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int size = in.nextInt();
        String[] coll = new String[size];
        for (int i = 0; i < size; i++) {
            coll[i] = "человек №" + (i + 1);
        }

        ArrayList<String> arrayList = new ArrayList<>(List.of(coll));
        long start = System.currentTimeMillis();
        drop(arrayList);
        long timeArrayList = System.currentTimeMillis() - start;

        LinkedList<String> linkedList = new LinkedList<>(List.of(coll));
        start = System.currentTimeMillis();
        drop(linkedList);
        long timeLinkedList = System.currentTimeMillis() - start;

        System.out.println("Время работы ArrayList: " + timeArrayList + " мс");
        System.out.println("Время работы LinkedList: " + timeLinkedList + " мс");
    }
}
