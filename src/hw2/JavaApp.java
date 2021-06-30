package hw2;

import java.util.Arrays;

public class JavaApp {

    public static void invertArray(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr));
        }
    }

    public static void fillArray(String[] args) {
        int[] array = new int[8];
        int j = 1;

        for (int i = 0; i < array.length; i++, j = j + 3)
            array[i] = j;
        System.out.print(Arrays.toString(array));

    }

    public static void changeArray(String[] args) {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) w[i] = w[i] * 2;
        }
        System.out.print(Arrays.toString(w));
    }

    public static void fillDiagonal(String[] args) {
        int[][] arrg = new int[4][4];
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                if ((i == j) || (i + j == 4)) {
                    arrg[i][i] = 1;
                }

            }
    }
}
