package hw12;

import java.util.Arrays;

public class MainThr {
    public static class Task5 {

        static final int size = 10000000;
        static final int h = size / 2;


        public static void main(String[] args) {
            float[] arr = new float[size];
            fillArr(arr);
            formula1(arr);

            fillArr(arr);
            formula2(arr);
        }

        public static void fillArr(float[] arr) {
            Arrays.fill(arr, 1);
        }

        public static void formula1(float[] arr) {
            long startT = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            long endT = System.currentTimeMillis();
            System.out.println("Formula1 Total execution time: " + (endT - startT) + "ms");
            System.out.println(arr[h]);
        }

        public static void formula2(float[] arr) {
            long startT = System.currentTimeMillis();
            float[] a1 = new float[h];
            float[] a2 = new float[h];

            System.out.println(arr, 0, a1, 0, h);
            System.out.println(arr, h, a2, 0, h);

            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < a1.length; i++) {
                    a1[i] = (float) (a1[i]) * Math.sin((0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

                }
            });
            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < a2.length; i++) {
                    a1[i] = (float) (a2[i]) * Math.sin((0.2f + (i + h) / 5) * Math.cos(0.2f + (i + h) / 5) * Math.cos(0.4f + (i + h) / 2));
                }
            });
            thread1.start();
            thread2.start();
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }


}
