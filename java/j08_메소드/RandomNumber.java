package j08_메소드;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randNum = random.nextInt(100) + 100; // 100~199 사이 +100해줌
            System.out.println(randNum);
        }
    }
}