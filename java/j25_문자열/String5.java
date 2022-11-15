package j25_문자열;

public class String5 {
    public static void main(String[] args) {

        String httpMethod = "Get";

        if(httpMethod.equalsIgnoreCase("get")) { // equalsIgnoreCase 대소문자 상관없이 해당문자 인식하게함.
            System.out.println("get 요청입니다.");
        }else {
            System.out.println("get 요청이 아닙니다.");
        }

    }
}
