package j07_반복;

public class Loop6 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.println(i + 1);
        }

        int i = 0; // while  선언을 밖에 해야한다.

        while (i < n) {
            System.out.println(i +1); // 이렇게 하면 계속 반복 됨. 그러므로 탈출 조건을 만들어 줘야함.
            i++; // 탈출 조건
        }
    }
}
