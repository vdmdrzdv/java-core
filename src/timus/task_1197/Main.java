package timus.task_1197;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt(), x, y, bingo = 0;

        char x1, y1;
        for (int i = 0; i < test; i++) {
            String position = in.next();
            x1 = position.charAt(0);
            y1 = position.charAt(1);

            x = (int) x1 - 96;
            y = (int) y1 - 48;

            for (int j = -2; j <= 2; j++) {
                for (int k = -2; k <= 2; k++) {
                    if (k != j) {
                        if (x - j > 0 && y - k > 0 && x - j < 9 && y - k < 9) {
                            if (j * j + k * k == 5) {
                                bingo++;
                            }
                        }
                    }
                }
            }
            System.out.println(bingo);
            bingo = 0;
        }
        in.close();
    }
}
