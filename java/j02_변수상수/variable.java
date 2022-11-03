package j02_변수상수;

// 변수
public class variable {
    public static void main(String[] args) {

        // 논리자료형 변수
        boolean checkFlag = false;
        System.out.println(checkFlag);
        checkFlag = true;
        System.out.println(checkFlag);

        // 문자자료형 변수
        char name1 = '홍';
        char name2 = '길';
        char name3 = '동';
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name1 + name2 + name3); //이렇게 하면 145502 값이 나옴
        System.out.println("" + name1 + name2 + name3); // 이렇게 ""를 붙이면 글자로 나옴, 문자열 + 어떤거 = 문자열로 됨
        System.out.println('가' + 0);
        int a = '가' + 0;
        System.out.println(Integer.toHexString(a)); //변환하는거임

        // 문자열자료형 변수
        String name = "홍길동";
        String name4 = "심청이";
        String name5 = name + name4;
        System.out.println(name5);

        //정수자료형 변수
         int width = 100;
         int width2 = 200;

         String width3 = "300";
         String width4 = "400";

        int widthResult = width + width2;
         String widthResult2 = width3 + width4;

        System.out.println(widthResult);
        System.out.println(widthResult2);

        long time = System.currentTimeMillis();
        System.out.println(time);

        Long time2 = 1666178885589L; // in는 21억까지 적을 수 있다. 그래서 int가 오면 안되고 long이 와야한다.
        System.out.println(time2);

        //실수자료형 변수
        double pi = 30000000.141592653599999999;
        System.out.println(pi);

        //상수

        final String FILE_PATH = "C:/Users/junil"; // 앞에 final 빼면 가능, 상수는 전부 대문자로 표기
        //FILE_PATH = "D:/Users/aaaa"; 이렇게 하면 안됨 하지만 ↑
        System.out.println(FILE_PATH);



    }
}

