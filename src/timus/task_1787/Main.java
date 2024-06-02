package timus.task_1787;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int left = 0;
        for (int i = 0; i < n; i++) {
            left = left + in.nextInt() - k;
            if (left < 0) {
                left = 0;
            }
        }
        System.out.println(left);
        in.close();
    }
}
