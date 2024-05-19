package lr6;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            final int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + ": Я поток номер " + threadNumber);
            });
            thread.start();
        }
    }
}
