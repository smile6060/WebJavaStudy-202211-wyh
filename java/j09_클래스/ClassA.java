package j09_클래스;

import java.sql.SQLOutput;

public class ClassA {

    int num;
    String name;
    double score;

    // 모든 클래스는 ClassA() {} 가 생략되어있다. 생성자이다. 여기서  ClassA이지 다른 클래스명이면 바뀜
    // 생성자는 클래스 명이랑 일치해야한다.
    // 반환자료형, 생성자는 항상 반환이 있다. 그래서 반환자료형을 정의하지 않는다. 생략한다.
    // 생성자도 오버로딩이 된다.

    //생성자

    ClassA() {

    }
    ClassA(int a) {
        System.out.println("a: " + a);
        System.out.println("ClassA를 생성합니다."); // 다른 생성자로 오버로딩 되면 기본 생성자는 실행되지 않는다. 둘다 쓰고 싶으면 오버로딩하면 된다.
    }

    void callName() {
        System.out.println(name + "을(를) 부릅니다.");
    }

}
