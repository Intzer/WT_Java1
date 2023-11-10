package main.java.by.bsuir.lab1.task6;

public class Resolver {

    public static double[][] generateMatrix(double[] array) {
        int n = array.length;
        double[][] matrix = new double[n][n];

        for (int i = 0; i < n; i++) {
            int k = i;
            for (int j = 0; j < n; j++) {
                matrix[i][j] = array[k];
                k = (k + 1) % n;
            }
        }

        return matrix;
    }
}
