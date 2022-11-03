package j04_연산자;

public class Operation1 {
    public static void main(String[] args) {
        int num = 10;
        num = num + 1; //=은 같다라는 의미가 아니라 대입이라는 뜻을 가짐.
        System.out.println(num);
       /* num++; //단일로도 사용가능*/
        System.out.println(++num); // 1이 증가 되면서 num 변수에 대입. 선증가
        System.out.println(num++); // 후증가 이 다음번에 +1 시켜라
        System.out.println(num);

        int num1 = 10;
        num1 = num1 + 1;
        System.out.println(num1);
        System.out.println(--num1);
        System.out.println(num1);


    }
}
