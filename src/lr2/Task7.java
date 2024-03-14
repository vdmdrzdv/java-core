package lr2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount(0);
        System.out.println("Начальный баланс: " + bankAccount.getBalance());

        System.out.print("На сколько вы хотите пополнить счет? ");
        bankAccount.deposit(id.nextFloat());
        System.out.println("Текущий баланс: " + bankAccount.getBalance());

        System.out.print("Сколько денег вы хотите снять со счета? ");
        bankAccount.removal(id.nextFloat());
        System.out.println("Текущий баланс: " + bankAccount.getBalance());
    }
}
