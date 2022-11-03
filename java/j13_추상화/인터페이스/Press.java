package j13_추상화.인터페이스;

//Interface(인터페이스)
//1. 기본적으로 모든 메소드가 추상메소드로 정의된다.
//2. 일반 메소드를 정의하기 위해서는 default 키워드를 사용해야한다.
//ex)  public default void pop() {}
//3. 생성자 정의는 불가능하다. ex)     public Switch() {}
//4. 일반 변수 선언 불가능하다. ex) private String name;
//상수는 선언할 수 있다. ex) public final String NAME = "switch";
// 상수선언에 private은 안된다. getsetter  때문에.. 접근지정자  public  사용
public interface Press {
    public final String NAME = "Press";

    public void onPressed();



}
