package timus.task_1225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long[] f = new long[45];

        f[0] = 2;
        f[1] = 2;
        for (int i = 2; i < N; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        System.out.println(f[N-1]);
        in.close();
    }
}
