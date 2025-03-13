package org.example;

// 문제 : 정수 i가 가지고 있는 10을 double 형 변수에 넣고 해당 변수의 값을 다시 i에 넣는 코드를 작성해주세요.

//class Main {
//    public static void main(String[] args) {
//        int i = 10;
//        double d = i; // 여기선 자동형변환 허용
//        i = (int)d; // 여기선 자동형변환 불가능
//        System.out.println(i);
//        System.out.println(d);
//        System.out.println(i);
//    }
//}

// 문제 : 자동차 리모콘이 페라리 객체를 가리키게 한 후 해당 리모콘이 가리키고 있는 객체를 다시 페라리 리모콘으로 가리키게(참조하게) 하는 코드를 작성해주세요.

class Main {
    public static void main(String[] args) {
        // 수정가능지역 시작
        자동차 a자동차 = new 페라리();

        페라리 a페라리 = (페라리)a자동차;

//        a페라리.달리다();
//        a페라리.서다();
//        a페라리.뚜껑이_열리다();



        // 수정가능지역 끝
    }
}
class 자동차 {
    void 달리다() {}
    void 서다() {}
}
class 페라리 extends 자동차 {
    void 뚜껑이_열리다() {}
}