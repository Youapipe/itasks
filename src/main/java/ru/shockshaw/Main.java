package ru.shockshaw;

public class Main {
    public static void main(String[] args) {
        Matrix m = new Matrix(new int[][]{
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 9}
        });
        //m.print();
        System.out.println(m.get(1,1));
        System.out.println(m.trace());
        System.out.println(m.det());

    }
}