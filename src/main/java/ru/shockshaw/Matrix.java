package ru.shockshaw;

public final class Matrix {
    private int[][] matrix = new int[3][3];

    public Matrix(int[][] matrix) {
        this.matrix = matrix.clone();
    }
    public int get(int i, int j) {return matrix[i][j];}
    public int trace() {
        int result = 0;
        for (int i = 0; i < 3; i++) result += matrix[i][i];
        return result;
    }
    public int det() {
        return (matrix[0][0]*matrix[1][1]*matrix[2][2] -
                matrix[0][0]*matrix[1][2]*matrix[2][1] -
                matrix[0][1]*matrix[1][0]*matrix[2][2] +
                matrix[0][1]*matrix[1][2]*matrix[2][0] +
                matrix[0][2]*matrix[1][0]*matrix[2][1] -
                matrix[0][2]*matrix[1][1]*matrix[2][0]);
    }
    public int[][] add(int[][] toAdd) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix[i][j] + toAdd[i][j];
            }
        }
        return result;
    }
    public int[][] subtract(int[][] toSubtract) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix[i][j] - toSubtract[i][j];
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
