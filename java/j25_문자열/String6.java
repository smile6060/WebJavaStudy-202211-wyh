package j25_문자열;

public class String6 {
    public static void main(String[] args) {

        String httpRequest = "";

        /*
        문자열이 비어있지 않으면
        1. null이 아니여야한다.
        isBlank 2. 3.을 의미. JDK 11버전부터 사용가능
        2. "" 빈값이 아니여야한다.
        3. " " 스페이스바 비어있는것도 아니여야한다.
        비어있지 않다는걸 검사하는 방범 ↓
         */
//        if(!httpRequest.isBlank()) {
//            System.out.println(httpRequest);

        if(!httpRequest.isEmpty()) { // isEmpty는 띄어쓰기는 공백으로 보지 않음
            System.out.println(httpRequest);
        }else {
            System.out.println("공백은 사용할 수 없습니다.");
        }
    }
}
