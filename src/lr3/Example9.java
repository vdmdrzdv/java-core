package lr3;

import java.util.HashMap;

public class Example9 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "строка 1");
        hashMap.put(2, "строка 2");
        hashMap.put(3, "строка 3");
        hashMap.put(4, "строка 4");
        hashMap.put(5, "строка 5");
        hashMap.put(6, "строка 6");
        hashMap.put(7, "строка 7");
        hashMap.put(8, "строка 8");
        hashMap.put(9, "строка 9");
        hashMap.put(10, "строка 10");

        int multiplication = 1;
        boolean comma = false;
        for (int key:hashMap.keySet()) {
            if (comma) {
                System.out.print(", ");
            }
            if (key > 5) {
                System.out.print(hashMap.get(key));
                comma = true;
            }

            if (hashMap.get(key).length() > 5) {
                multiplication *= key;
            }
        }
        System.out.println("\nПеремножение ключей с длиной строки > 5 = " + multiplication);
    }
}
