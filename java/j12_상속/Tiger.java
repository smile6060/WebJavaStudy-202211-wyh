package j12_상속;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }

   // ctrl + space 방향 뒤버튼에서 move 찾음

    @Override
    public void move() {
        super.move();
    }
    public String getName() {
        return super.getName();

    }
    public void setName(String name) {
        super.setName(name);
    }


    //    @Override
//    public void move() {
//        System.out.println("네 발로 뜁니다.");
//    }
}
