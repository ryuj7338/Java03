package org.example;

// extends => 상위 클래스(ex. 고양이)가 하위 클래스(ex.검은고양이, 흰 고양이)에게 상속
// class 상위클래스명
// class 하위클래스명 extends 상위클래스명
// 중복을 최소화하기 위해 extends 사용

// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : `숨쉬다` 기능을 중복하지 말아주세요.

class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.숨쉬다();
    }
}
class 동물 {
    void 숨쉬다() {
        System.out.println("숨쉬다.");
    }
}
class 사람 extends 동물 {

}