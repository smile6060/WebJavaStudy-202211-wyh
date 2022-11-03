package j12_상속;

public class Animal {
    private String name; // 변수는 public 사용x private 그러면 사용하려면 게터 세터를 사용한다.

    public Animal(String name) {
        System.out.println("Animal 생성");
        this.name = name;
    }

    public void move() {
        System.out.println("움직입니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}


