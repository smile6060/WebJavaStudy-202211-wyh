package j15_Object클래스;

public class Main {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("김준일", "부산"); // 클래스 생성

        int hashCode = objectTest.hashCode();

        System.out.println(hashCode);
        System.out.println(Integer.toHexString(hashCode)); // Integer를 16진수로 바꿔라 = toHexString

        System.out.println(objectTest);
    }
}
