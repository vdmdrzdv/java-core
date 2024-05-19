package lr6;

import java.util.concurrent.*;

public class Task6 {
    public static int sumArray(int[] arr) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Количество ядер: " + numThreads);
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        Future<Integer>[] results = new Future[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i;
            results[i] = executor.submit(() -> {
                int sum = 0;
                int start = threadIndex * (arr.length / numThreads);
                int end = (threadIndex == numThreads - 1) ? arr.length : (threadIndex + 1) * (arr.length / numThreads);
                for (int j = start; j < end; j++) {
                    sum += arr[j];
                }
                return sum;
            });
        }

        int totalSum = 0;
        for (Future<Integer> result : results) {
            try {
                totalSum += result.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        return totalSum;
    }

    public static void main(String[] args) {
        int[] array = {-5, 17, -1, 95, 52, -22, 88, 61, 34};
        int sum = sumArray(array);
        System.out.println("Сумма элементов в массиве: " + sum);
    }
}
