package org.example;


//// 문제 : 아래가 실행되도록 해주세요.
//
//class Main {
//    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//
//        a전사.나이 = 20;
//        a전사.a무기 = new 활();
//        a전사.a무기 = new 칼();
//    }
//}
//class 전사 {
//    int 나이;
//    무기 a무기;
//
//}
//class 무기 {
//
//}
//class 활 extends 무기 {
//
//}
//class 칼 extends 무기 {
//
//}

// 문제 : 아래가 실행되도록 해주세요.

//class Main {
//    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//
//        String 이름 = "칸";
//        a전사.이름 = 이름;
//        a전사.나이 = 20;
//        a전사.자기소개();
//
//        a전사.나이++;
//        a전사.자기소개();
//
//        a전사.나이 = 30;
//        a전사.이름 = "카니";
//        a전사.자기소개();
//
//        a전사.a무기 = new 활();
//        a전사.공격();
//        // 출력 : 카니가 활로 공격합니다.
//
//        a전사.a무기 = new 칼();
//        a전사.공격();
//        // 출력 : 카니가 칼로 공격합니다.
//    }
//}
//
//class 전사 {
//    // 인스턴스 변수
//    String 이름;
//    // 인스턴스 변수
//    int 나이;
//    // 인스턴스 변수
//    무기 a무기;
//
//    void 자기소개() {
//        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
//    }
//    void 공격(){
//
//        this.a무기.사용(this.이름);
//
//
//    }
//}
//
//class 무기 {
//    void 사용(String 이름) {
//
//    }
//
//}
//
//class 칼 extends 무기 {
//    void 사용(String 이름) {
//        System.out.println(이름 + "가 칼로 공격합니다.");
//    }
//
//}
//
//class 활 extends 무기 {
//    void 사용(String 이름) {
//        System.out.println(이름 + "가 활로 공격합니다.");
//    }
//
//}


// 아래의 코드가 실행되도록 해주세요

public class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "진";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        //출력 : 진이 활로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        //출력 : 진이 칼로 공격합니다.
    }
}

class 전사 {
    //인스턴스 변수
    String 이름;
    int 나이;
    무기 a무기;

    void 자기소개(){
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }
    void 공격(){
        a무기.사용자명 = 이름;
        a무기.사용();
    }
}

class 무기{
    String 사용자명;

    void 사용(){

    }

}
class 칼 extends 무기{
    void 사용() {
        System.out.println(this.사용자명+ "이 칼로 공격합니다.");
    }

}

class 활 extends 무기{
    void 사용() {
        System.out.println(this.사용자명 + "이 활로 공격합니다.");
    }
}