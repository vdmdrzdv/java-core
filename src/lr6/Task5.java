package lr6;

import java.util.Arrays;
import java.util.concurrent.*;

public class Task5 {
    public static int findMax(int[] arr) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Количество ядер: " + numThreads);
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        Future<Integer>[] results = new Future[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i;
            results[i] = executor.submit(() -> {
                int max = Integer.MIN_VALUE;
                int start = threadIndex * (arr.length / numThreads);
                int end = (threadIndex == numThreads - 1) ? arr.length : (threadIndex + 1) * (arr.length / numThreads);
                for (int j = start; j < end; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                }
                return max;
            });
        }

        int globalMax = Integer.MIN_VALUE;
        for (Future<Integer> result : results) {
            try {
                int localMax = result.get();
                if (localMax > globalMax) {
                    globalMax = localMax;
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        return globalMax;
    }

    public static void main(String[] args) {
        int[] array = {-5, 17, -1, 95, 52, -22, 88, 61, 34};
        System.out.println("Массив: " + Arrays.toString(array));
        int maxElement = findMax(array);
        System.out.println("Максимальный элемент в массиве: " + maxElement);
    }
}
