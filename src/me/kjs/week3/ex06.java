package me.kjs.week3;

import me.kjs.week2.Member;

public class ex06 {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        Member junseop = new Member();
        Member kisun = junseop;
        System.out.println(junseop == kisun);
    }
}


