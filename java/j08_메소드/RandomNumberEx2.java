package j08_메소드;

import java.util.Random;

public class RandomNumberEx2 {

    public static int calcRandom(int m) {
        Random random = new Random();
        int result = random.nextInt(10) * 1000 + m;

        return result; // 리턴(반환) 자료형이라 한다.
    }
    public static void main(String[] args) {

        int money = 5000;

        //calcRandom(money); //칼크랜덤(변수머니) 위에 모든 공식을 이걸로(calcRandom(money)) 단축시킴
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));

        int r = calcRandom(money);
        System.out.println(r + 100);
        System.out.println(r + 1000);
        System.out.println(r + 10000);
        System.out.println(r + 100000);
        }
    }

    // 코드 재사용 없이 사용할 때 메소드(함수)를 사용한다. 여기서 사용한 메소드는 리턴 자료형이다.
    // 복잡하고 반복적인 것을 하지 않기 위해 메소드를 사용한다.