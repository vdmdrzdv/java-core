package timus.task_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        int sum = 0;
        if (N > 0) {
            for (int i = 1; i <= N; i++) {
                sum += i;
            }
        } else {
            for (int i = 1; i >= N; i--) {
                sum += i;
            }
        }
        System.out.print(sum);
    }
}
