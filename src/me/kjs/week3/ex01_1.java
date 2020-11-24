package me.kjs.week3;

public class ex01_1 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println("n++(2) * n++(3) = " + n++ * n++);
        System.out.println("n = " + n);

        int m = 2;
        System.out.println("++m(3) * m++(3) = " + (++m * m++));
        System.out.println("m = " + m);
    }
}

