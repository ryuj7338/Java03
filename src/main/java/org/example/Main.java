package org.example;


public class Main {
    public static void main(String[] args) {
        사람 사람1 = new 김철수("김철수2");
//        사람1.이름 = "김철수";
//        사람1.나이 = 22;
//        사람1.나이를_22로_설정();
        System.out.println("==사람1 정보==");
        System.out.printf("이름 : %s\n",사람1.이름); // 김철수
        System.out.printf("나이 : %d\n",사람1.나이); // 22

        사람 사람2 =new 사람();
        사람2.이름 = "이영희";
 //       사람2.나이 = 33;
 //       사람2.나이를_22로_설정();
        System.out.println("==사람2 정보==");
        System.out.printf("이름 : %s\n",사람2.이름); // 이영희
        System.out.printf("나이 : %d\n",사람2.나이); // 33


    }
}

class 사람 {
    String 이름;
    int 나이;

//    void 나이를_22로_저장(){    // 수동
//        this.나이 = 22;
//    }

    사람(){   // 자동
        System.out.println("사람 생성자 실행됨");   // 부모 생성자와 자식 생성자 둘 다 실행함수가 있다면 부모 생성자 먼저 실행
        this.나이 = 22;
    }


}
class 김철수 extends 사람 {
    김철수() {
        System.out.println("김철수 생성자 실행됨");
        this.이름 = "김철수";
    }

    김철수(String 이름) {
        System.out.println("김철수2 생성자 실행됨");
        this.이름 = "김철수2";
    }
}