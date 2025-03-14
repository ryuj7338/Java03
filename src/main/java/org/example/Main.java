package org.example;

// 유니코드

public class Main {
    public static void main(String[] args) {
        System.out.println((int) '가');
        System.out.println((int) '힣');

        System.out.println(isHangeul('안'));
        System.out.println(isHangeul('녕'));
        System.out.println(isHangeul('A'));
        System.out.println(isHangeul('.'));
        System.out.println(isHangeul(' '));

    }
    static boolean isHangeul(char c) {
        return  c >= '가' && c <= '힣';
    }
}

