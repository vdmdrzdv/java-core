package lr3;

import java.util.*;

public class Benchmark {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < 9000000; i++) {
            arrayDeque.addFirst(i);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 9000000; i++) {
            arrayList.add(i);
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 9000000; i++) {
            treeSet.add(i);
        }

        System.out.println("Время выполнения операции добавления элемента в начало arrayDeque = " + getRunningTimeAddFirst(arrayDeque));
        System.out.println("Время выполнения операции добавления элемента в начало arrayList = " + getRunningTimeAddFirst(arrayList));
        System.out.println("Время выполнения операции добавления элемента в treeSet = " + getRunningTimeAdd(treeSet));

        System.out.println("\nВремя выполнения операции добавления элемента в конец arrayDeque = " + getRunningTimeAddLast(arrayDeque));
        System.out.println("Время выполнения операции добавления элемента в конец arrayList = " + getRunningTimeAddLast(arrayList));

        System.out.println("\nВремя выполнения операции добавления элемента в середину arrayList = " + getRunningTimeAddCenter(arrayList));

        System.out.println("\nВремя выполнения операции удаления элемента в начале arrayDeque = " + getRunningTimeRemoveFirst(arrayDeque));
        System.out.println("Время выполнения операции удаления элемента в начале arrayList = " + getRunningTimeRemoveFirst(arrayList));
        System.out.println("Время выполнения операции удаления элемента в начале treeSet = " + getRunningTimeRemoveFirst(treeSet));

        System.out.println("\nВремя выполнения операции удаления элемента в конце arrayDeque = " + getRunningTimeRemoveLast(arrayDeque));
        System.out.println("Время выполнения операции удаления элемента в конце arrayList = " + getRunningTimeRemoveLast(arrayList));
        System.out.println("Время выполнения операции удаления элемента в конце treeSet = " + getRunningTimeRemoveLast(treeSet));

        System.out.println("\nВремя выполнения операции удаления элемента в середине arrayList = " + getRunningTimeRemoveCenter(arrayList));
        System.out.println("Время выполнения операции удаления элемента в середине treeSet = " + getRunningTimeRemoveCenter(treeSet));

        ArrayList<Integer> bigArrayList = new ArrayList<>();
        for (int i = 0; i < 20000000; i++) {
            bigArrayList.add(i);
        }

        TreeSet<Integer> bigTreeSet = new TreeSet<>();
        for (int i = 0; i < 20000000; i++) {
            bigTreeSet.add(i);
        }
        System.out.println("\nВремя выполнения операции получения элемента по индексу arrayList = " + getRunningTimeGetElement(bigArrayList));
        System.out.println("Время выполнения операции получения элемента treeSet = " + getRunningTimeGetElement(bigTreeSet));
    }

    private static long getRunningTimeAddFirst(ArrayDeque<Integer> arrayDeque){
        long start = System.currentTimeMillis();
        arrayDeque.addFirst(9000000);
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeAddLast(ArrayDeque<Integer> arrayDeque){
        long start = System.currentTimeMillis();
        arrayDeque.addLast(9000001);
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeRemoveFirst(ArrayDeque<Integer> arrayDeque){
        long start = System.currentTimeMillis();
        arrayDeque.removeFirst();
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeRemoveLast(ArrayDeque<Integer> arrayDeque){
        long start = System.currentTimeMillis();
        arrayDeque.removeLast();
        long end = System.currentTimeMillis();

        return end - start;
    }


    private static long getRunningTimeAddFirst(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        arrayList.add(0, 9000000);
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeAddLast(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        arrayList.add(9000001);
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeAddCenter(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        arrayList.add(4500000, 9000002);
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeRemoveFirst(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        arrayList.remove(0);
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeRemoveLast(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        arrayList.remove(arrayList.size() - 1);
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeRemoveCenter(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        arrayList.remove(4500000);
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeGetElement(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        arrayList.get(10000000);
        long end = System.currentTimeMillis();

        return end - start;
    }


    private static long getRunningTimeAdd(TreeSet<Integer> treeSet){
        long start = System.currentTimeMillis();
        treeSet.add(9000000);
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeRemoveFirst(TreeSet<Integer> treeSet){
        long start = System.currentTimeMillis();
        treeSet.remove(treeSet.first());
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeRemoveLast(TreeSet<Integer> treeSet){
        long start = System.currentTimeMillis();
        treeSet.remove(treeSet.last());
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeRemoveCenter(TreeSet<Integer> treeSet){
        long start = System.currentTimeMillis();
        treeSet.remove(4500000);
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeGetElement(TreeSet<Integer> treeSet){
        long start = System.currentTimeMillis();
        treeSet.last();
        long end = System.currentTimeMillis();

        return end - start;
    }
}