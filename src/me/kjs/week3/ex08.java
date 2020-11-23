package me.kjs.week3;

import java.io.Serializable;

public class ex08 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10) % 10;
        int b = (int) (Math.random() * 10) % 10;
        String s1 = a == b ? "isEquals" : a > b ? "a more then b" : "a less then b";
        String s2 = a == b ? "isEquals" : a > b ? "a more then b" : a < b ? "a less then b" : a == b ? "a":"b";
    }
}


