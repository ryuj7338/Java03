package org.example;

// ex) 블루스크린 -> 오류
// ex) 실행창이 뜨는 오류현상 -> 예외처리 가능
// try ~ catch 문 - if 문처럼 해당되는 부분만 실행

public class Main {
    public static void main(String[] args) {

        try {
            int rs =계산기.나누다(10, 0);
            System.out.println(rs);

        } catch (ArithmeticException e) {   // class 계산기 부분에서 예외처리 했기 떄문에 pass
            System.out.println("0으로 못 나눠");
        } catch (Exception e) { // class 계산기 부분에서 예외처리 했기 떄문에 pass
            System.out.println("알 수 없는 예외 발생");
        } finally {
            System.out.println("어쨌든 실행");
        }

        System.out.println(123);


    }
}
class 계산기{
    static int 나누다(int a, int b) throws ArithmeticException {   // throws 는 경고문 같은거 ex.개조심
        int rs = 0;

//        rs = a / b;

        try {
            rs = a / b;
            return rs;
        }catch (ArithmeticException e) {
            System.out.println("try 중에 뭔가 잘못됨");
            return 0;
        }
//        try {
//            rs = a / b;
//        }catch (ArithmeticException e) {
//            System.out.println("try 중에 뭔가 잘못됨");
//        }



 //       return  rs;
    }
}

