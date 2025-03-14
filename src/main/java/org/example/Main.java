package org.example;

// stactic은 클래스 변수 , 모든 인스터스와 공유, 객체 생성과 무관하다.
// this() -> 다른 생성자 호출(실행), Constructor call


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();

        a사람.setId(20);       // public 함수
//        a사람.id = 20;    // private 함수를 사용하면 외부에서 내부 class 사람에 접근 x

//        System.out.println("번호 : "+ a사람.id);
        System.out.println("번호 : "+ a사람.getId());
    }
}

class 사람 {
    private int id;
    private int age;
    private String Name;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    
    public void getId() {
       return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}



