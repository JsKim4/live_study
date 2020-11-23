package me.kjs.week2;

public class Main {
    public static void main(String[] args) {
        Member member = new Member();

        System.out.println("member.intField : " + member.intField);
        System.out.println("member.floatField : " + member.floatField);
        System.out.println("member.memberField : " + member.memberField);
    }
    public static class Member {
        int intField;
        float floatField;
        Member memberField;
    }
}




