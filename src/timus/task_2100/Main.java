package timus.task_2100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int numberOfPlus = 2;
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            if (line.contains("+")) {
                numberOfPlus++;
            }
        }
        in.close();
        int sum = n + numberOfPlus;
        if (sum == 13) sum++;
        System.out.print(sum * 100);
    }
}
