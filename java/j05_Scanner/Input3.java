package j05_Scanner;
import java.util.Scanner;
/*
이름: 김준일                name
나이: 29                   age
주소: 부산 동래구 사직동      address
연락처: 010 9988 1916      phone

사용자의 이름은 김준일이고 나이는 29입니다.
주소는 부산 동래구 사직동이며 연락처는 010 9988 1916입니다.
 */
public class Input3 {
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);


        String name = null; // 변수 선언을 위에 모아둔다.
        int age = 0;
        String address =null;
        String phone = null;

        System.out.println("이름: ");
        name = scanner.next();

        System.out.println("나이: ");
        age = scanner.nextInt();

        System.out.println("주소: ");
        scanner.nextLine(); //이걸 해줘야지 버퍼 엔터가 날라감 넥스트라인은 엔터를 먹지만 나머지는 아님
        address = scanner.nextLine();

        System.out.println("연락처: ");
        phone = scanner.nextLine();

        System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "입니다.");
        System.out.println("주소는 " + address + "이며 연락처는 " + phone + "입니다.");

    }
}
