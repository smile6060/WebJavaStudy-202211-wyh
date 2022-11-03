package j14_참조자료형캐스팅;

public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer();
        Computer computer2 = new Computer();//Computer computer1 = new Computer();,Computer computer2 = new Computer(); Computer computer3 = new Computer();
        Computer computer3 = new Computer();
        LED led = new LED();
        Speaker speaker = new Speaker();

        CentralControl centralControl = new CentralControl(new Power[5]); //computer1 computer2 computer3 이렇게도 활용가능
//         CentralControl centralControl = new CentralControl((Power) computer, (Power) led, (Power) speaker);
//        원래는 이렇게 형변환이 되어야한다. 묵시적형변환=업캐스팅 업캐스팅은 생략가능해서 Power를 쓰지않음

        centralControl.addDevice(computer1);
        centralControl.addDevice(speaker);
        centralControl.addDevice(computer2);
        centralControl.addDevice(led);
        centralControl.addDevice(led);
        centralControl.addDevice(led);

        centralControl.powerOn();
        System.out.println("------------------------------");
        centralControl.powerOff();
    }
}
