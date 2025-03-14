package org.example;

// == : 주소값 비교
// equals : String(참조타입)에서 사용

public class Main {
    public static void main(String[] args) {

        String s1 = "하";
        s1 += "하";

        String s2 = "하하";

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1 == s2);   // 연산자에 의한 비교 / 기본타입 비교는 가능 , 객체끼리 비교는 불가능
        System.out.println(s1.equals(s2));  // equals라는 함수에 의한 비교(동등성 비교)   , 객체끼리 비교할떄 사용

//        char c = '하';
//
//        char cc = 'a';
//        cc = 'b';
//
//        String ss = "abc";  //  힙영역 -> abc
    }
}

