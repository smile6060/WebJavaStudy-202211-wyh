package j13_추상화.인터페이스;

public class PowerButton extends Button {

    private boolean status; //boolean에 값을 안 넣으면 자동으로 false로 인식함

    @Override
    public void onPressed() {
        if(status) {
            status = false;
            System.out.println("전원을 끕니다.");
        }else {
            status = true;
            System.out.println("전원을 켭니다.");
        }

    }

}