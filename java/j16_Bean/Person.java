package j16_Bean;

public class Person {
    private final String name; // 멤버변수에 final을 선언하면 필수값이 된다.
    private int age; // 상수로 만들어 줌 초기화. 초기화를 하면 생성을 꼭 해야함 리콰이어드 아규 컨설터라 부름. 만약 인트가 초기화가 아니면  네임 컨설터 꼭 생성해야함.

    // public Person() {} <- NoArgsConstructor 이거는 생성할 수 없음. NoArgsConstructor는 requiredArgsConstructor와 함께 쓸 수 없다.

    public Person(String name) {             // requiredArgsConstructor
        this.name = name;
    }

    public Person(String name, int age) {          //AllArgsConstructor
        this.name = name;
        this.age = age;
    }
}
