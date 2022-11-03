package j07_반복;

public class Star {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // *이 1~10까지 하나씩 증가

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");

            }

            System.out.println();
        } // 반대로 해봐라 10~1로
        for (int i = 0; i < 10; i++) { // 기준을 바꾸지 말기

            for (int j = 0; j < 10 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
