package timus.task_1880;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size1 = Integer.parseInt(in.nextLine());
        String[] string1 = in.nextLine().split(" ");
        int size2 = Integer.parseInt(in.nextLine());
        String[] string2 = in.nextLine().split(" ");
        int size3 = Integer.parseInt(in.nextLine());
        String[] string3 = in.nextLine().split(" ");

        int allSize = size1 + size2 + size3;
        String[] strings = new String[allSize];
        for (int i = 0, x = 0, y = 0; i < allSize; i++) {
            if (i < size1) {
                strings[i] = string1[i];
                continue;
            }
            if (i < size1 + size2) {
                strings[i] = string2[x];
                x++;
                continue;
            }
            strings[i] = string3[y];
            y++;
        }

        Arrays.sort(strings);
        int count = 0;
        for (int i = 1; i < strings.length - 1; i++) {
            if (strings[i - 1].equals(strings[i]) && strings[i + 1].equals(strings[i])) {
                count++;
            }
        }

        in.close();
        System.out.print(count);
    }
}
