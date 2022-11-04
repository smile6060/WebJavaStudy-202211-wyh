package j13_추상화.인터페이스;

import j13_추상화.추상클래스.Button;

public class VolumeDownButton extends Button {

    @Override
    public void onPressed() {
        System.out.println("음량을 한칸 내립니다.");
    }
    @Override
    public void OnDown() {
        System.out.println("음량을 계속 내립니다.");;
    }
    }
