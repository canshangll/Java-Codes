package com.lmj;

public class ArrayGenerator {

    private ArrayGenerator() {
    }

    public static Integer[] generateOrderedArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] dataSize = {1000000, 10000000};
        for (int n : dataSize) {
            Integer[] data = ArrayGenerator.generateOrderedArray(n);
            long start = System.nanoTime();
            for (int k = 0; k < 100; k++) {
                LinearSearch.search(data, n);
            }
            long end = System.nanoTime();
            double time = (end - start) / 1000000000.0;
            System.out.println("n = " + n + ",100 runs :" + time + "s");
        }
    }

}
