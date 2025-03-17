package org.example;

// 키워드 - Object클래스, toString()

public class Main {
    public static void main(String[] args) {
        사람 a사람1 = new 사람("김철수", 22);
        사람 a사람2 = new 사람("홍길동", 33);

        System.out.println(a사람1);
        System.out.printf("이름 : %s, 나이 : %d\n", a사람1.name, a사람1.age);
        System.out.println(a사람2);
        System.out.printf("이름 : %s, 나이 : %d\n", a사람2.name, a사람2.age);

    }
}
class 사람 extends Object {
    String name;
    int age;

    @Override
    public String toString() {
        return "사람{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    사람(String name, int age) {
        this.name = name;
        this.age = age;
    }



}


