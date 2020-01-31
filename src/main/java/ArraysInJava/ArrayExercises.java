package ArraysInJava;

import java.util.Arrays;

public class ArrayExercises {
    // According to:
    //https://www.samouczekprogramisty.pl/tablice-w-jezyku-java/

    //POPRAWKI
    // "instancje tablicy służących do" a nie służącej?

    // Exercise 1
    public static double geSum(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum;
    }

    // Exercise 2
    public static double getMaximum(double[] array) {
        double max = Integer.MIN_VALUE;
        for (double element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    //Exercise 3
    public static byte[][] createSudokuTable() {
        byte[][] table = new byte[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                table[i][j] = 0;
            }
        }
        return table;
    }

    public static byte[][] initializeSudokuTable() {

        byte[][] table =   {{2, 0, 0, 6, 0, 7, 5, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 9, 6},
                            {6, 0, 7, 0, 0, 1, 3, 0, 0},
                            {0, 5, 0, 7, 3, 2, 0, 0, 0},
                            {0, 7, 0, 0, 0, 0, 0, 2, 0},
                            {0, 0, 0, 1, 8, 9, 0, 7, 0},
                            {0, 0, 3, 5, 0, 0, 6, 0, 4},
                            {8, 4, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 5, 2, 0, 6, 0, 0, 8}};
        return table;
    }
}
