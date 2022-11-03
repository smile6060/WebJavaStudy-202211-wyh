package j03_형변환;

public class Conversion {
    public static void main(String[] args) {
        // upcasting(업캐스팅)
        char cast1 = 'a';
        System.out.println((int) cast1); //해당 문자열 값을 인트 정수형으로 자료형이 변환됨.
        int cast2 = (int) cast1;
        System.out.println(cast2); //묵시적 형변환 업캐스팅은 묵시적 형변환 가능

        //downcasting(다운캐스팅)
        int cast3 = 98;
        char cast4 = (char) cast3;
        System.out.println(cast4); //명시적 형변환 다운캐스팅은 명시적 형변환 해야한다.

        double cast5 = 3.14;
        int cast6 = (int) cast5;
        System.out.println(cast6);
        double cast7 = cast6;
        System.out.println(cast7);// 결과 값 3.0이 된다. 왜냐하면 앞에 이미 소숫점을 버렸기 때문


    }
}
