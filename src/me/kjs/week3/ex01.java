package me.kjs.week3;

public class ex01 {
    public static void main(String[] args) {
        float floatAndLongCalc = 2.7f + 9l;
        float floatAndIntCalc = 2.7f + 9;
        double doubleAndLongCalc = 2.9 + 9L;
        long intAndLongCalc = 2 + 9L;
        double intDivIntCalc = 15 / 4;
        double doubleModIntCalc = 2.7 % 3;
        double floatAndDoubleCalc = 2.7f + 2.9;
        String s1 = "string" + 5;
        String s2 = 5 + 4 + "string";
        String s3 = 5 + (4 + "string");

        System.out.println("floatAndLongCalc = " + floatAndLongCalc);
        System.out.println("floatAndIntCalc = " + floatAndIntCalc);
        System.out.println("doubleAndLongCalc = " + doubleAndLongCalc);
        System.out.println("intDivIntCalc = " + intDivIntCalc);
        System.out.println("doubleModIntCalc = " + doubleModIntCalc);
        System.out.println("intAndLongCalc = " + intAndLongCalc);
        System.out.println("floatAndDoubleCalc = " + floatAndDoubleCalc);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);




        int n = 2;
        System.out.println("n++ * n++ = "+n++ * n++);
        System.out.println("n = " + n);
    }
}


