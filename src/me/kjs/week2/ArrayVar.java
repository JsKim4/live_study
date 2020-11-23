package me.kjs.week2;

public class ArrayVar {

    public static void main(String[] args) {
        int length = 4;
        int[] integerArray1 = new int[4];
        int[] integerArray2 = {1, 2, 3, 4};
        int[] integerArray3 = new int[length];


        int[][] integerArray4 = new int[4][4];
        int[][] integerArray5 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] integerArray6 = {integerArray1, integerArray2};
        int[][] integerArray7 = new int[4][];
        for (int i = 0; i < integerArray7.length; i++) {
            integerArray7[i] = new int[i + 1];
        }
        return;
    }
}
