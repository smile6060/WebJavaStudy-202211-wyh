package j08_메소드;

import java.util.Random;

public class RandomNumberEx {

    public static void main(String[] args) {
        Random random = new Random();
// x + y = z 함수에는 입력과 출력이 있다. 디파인드
        int money = 5000;

        int a = random.nextInt(10) * 1000 + money;
        System.out.println(a);
        int b = random.nextInt(10) * 1000 + money;
        System.out.println(b);
        int c = random.nextInt(10) * 1000 + money;
        System.out.println(c);
        int d = random.nextInt(10) * 1000 + money; // 코드 할때 이렇게 반복적이고 중복적인거는 줄여야한다.
        System.out.println(d);

        System.out.println(a + b + c + d);

        }
    }
