package timus.task_2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTasks = in.nextInt();
        in.close();
        int difference = 12 - numberOfTasks;
        int time = difference * 45;
        if (time <= 240) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
