package j12_상속;

public class Human extends Animal { // extends 확장 Animal 상속 받고자 하는거 넣어주면 됨. 두개의 클래스를 합친거임

    public Human(String name) {
        super(name);
        // 생성자, 확장 했을 때에 부모님 역할을 함. 이것은 항상 생략되어있다. 부모 생성자는 항상 제일 위에 적어야함.
        System.out.println("Human 생성");
        // 코드의 순서가 중요 이 줄이 위에가면 빨간줄뜸.
    }
//    메소드 오버라이딩(오버라이드) : 재정의, 상위(Animal) 객체의 메소드를 하위(Human) 객체에서 다시 정의하는 행위
//    메소드 위에 @Override를 꼭 써줘야함. 해당 메소드가 상위 객체로부터 재정의된 메소드라는걸 표기하기 위해 해야 함.
    @Override // @: 골뱅이를 붙인거는 어노테이션이라고 부름.
    public void move() {
        super.move();
        System.out.println("두 발로 걷습니다.");
//    }
//    public void runMove() {
//        move(); // 상속을 했기 때문에 move를 생성을 하지 않아도 Animal 클래스에 있는 메소드를 사용할 수 있다.
//    }
    }
}
