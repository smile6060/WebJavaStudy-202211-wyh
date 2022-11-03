package j08_메소드;

import org.w3c.dom.ls.LSOutput;

/* 메소드 오버로딩
매개변수의 형태가 다르면 동일한
메소드 명을 가지고 정의할 수 있다.
 */
public class OverLoading {

    public static void add() {    // 메소드 명이 같으면 쓸 수 없다.
        System.out.println("add()");
    }

    public static void add(int a) {
        System.out.println("add(int a)"); //  int a의 매개 변수를 가지는 메소드
    }

    public static void add(String s) {
        System.out.println("add(String s)");
    }

    public static void add(int a, int b) {
        System.out.println("add(int a, int b)");
    }

    public static void add(int a, String b) {
        System.out.println("add(int a, String b)");
    }

    public static void add(String b, int a) {
        System.out.println("add(String b, int a)");
    }
    public static void main(String[] args) {

        add();
        add(10);
        add("10");
        add(10,20);
        add(10,"20");
        add("10",20);
    }

}
