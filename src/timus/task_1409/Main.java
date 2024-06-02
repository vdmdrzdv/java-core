package timus.task_1409;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        int numberOfCans = a + b - 1;
        int harry = numberOfCans - a;
        int larry = numberOfCans - b;
        System.out.print(harry + " " + larry);
    }
}
