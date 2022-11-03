package j07_반복;

public class Loop4Ex {
    public static void main(String[] args) {
//2단부터 9단까지 만들어라

        for (int i = 0; i < 8; i++) {

            int dan = i + 2;

            for (int j = 0; j < 9; j++) {
                int num = j + 1;
                System.out.println(dan + " x " + num + " = " + (dan * num));
            }
        }
    }
}

/*
            int dan = 2;
            for (int i = 0; i < 9; i++) {
                int num = i + 1;
                System.out.println(dan + " x " + num + " = " + (dan * num));

            int dan = 3;
            for (int i = 0; i < 9; i++) {
                int num = i + 1;
                System.out.println(dan + " x " + num + " = " + (dan * num));

            이렇게 하면 값은 구할 수 있지만 번거롭다. 근데 변수는 한번만 선언할 수 있는데 이게 되는 이유는
            지역이기 때문이다.  {} 이런거 안에 있는거 안에서만 쓰이는 거다 라는 뜻임.
*/