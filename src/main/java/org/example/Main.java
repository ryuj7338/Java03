package org.example;

// stactic은 클래스 변수 , 모든 인스터스와 공유, 객체 생성과 무관하다.
// this() -> 다른 생성자 호출(실행), Constructor call

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];

        Article[] articles = new Article[10];

        Article article1 = new Article();
        articles[0] = article1;

        Article article2 = new Article();
        articles[1] = article2;

        System.out.println(articles[0].id);
        System.out.println(articles[1].id);

        System.out.println(article1.id);
        System.out.println(article2.id);
    }
}

class Article {
    static int lastId;

    int id;
    String regDate;

    static {
        lastId = 0;
    }

    Article() {
        this(lastId + 1, "2025-12-12 12:12:12"); // 다른 생성자 호출(실행), Constructor Call
        lastId++;
    }

    Article(int id, String regDate) {
        this.id = id;
        this.regDate = regDate;
    }
}


