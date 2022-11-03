package j09_클래스;

public class ClassMain {
    //클래스는 틀
    public static void main(String[] args) {
        //new ClassA(); // 새로운  ClassA를 생성해라. <- 동작 변수는 동작 못함. 값을 저장하는 용도임. 동작은 메소드임. 그러므로 이것은 메소드이다.
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());

        ClassA a1 = new ClassA();//ClassA에 결과 주소를 담았다. a1에 변수나 메소드

        ClassA a2 = new ClassA();

        a1.name = "김준일";

        System.out.println(a1.name);

        a2.name = "김준이";

        System.out.println(a1.name);

        System.out.println(a2.name);

        a1.callName(); // 같은 메소드를 쓰지만 결과는 다르다.
        a2.callName();

    }

}
