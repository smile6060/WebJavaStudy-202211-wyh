package j05_Scanner;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        String name = "홍길동";

        /**
         * 문자열 입력
         *  next()       -> 띄어쓰기 포함  x
         *  nextLine()   -> 띄어쓰기 포함 o
         */
        Scanner scanner = new Scanner(System.in);//대입할 때 시스템 인 씀 이 말은 입력을 한다는 말임. 시스템은 콘솔창임

        String s = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

        System.out.println("입력 받은 값1: " + s);
        System.out.println("입력 받은 값2: " + s2);
        System.out.println("입력 받은 값3: " + s3);

    }
}
