package j15_Object클래스;

public class StringEquals {
    public static void main(String[] args) {
        int i = 10;

        String name1 = "김준일";
        String name2 = "김준일";
        String name3 = new String("김준일"); //객체는 주소를 담는다. new 메모리를 새로 할당받음
        String name4 = new String("김준일");

        System.out.println(name1 + "," + name2 + "," + name3);

        System.out.println(name1 == name2); //  결과 true
        System.out.println(name1 == name3); // 결과 false 주소가 틀리기 때문에  false임
        System.out.println(name3 == name4); // 결과 false 주소가 틀리기 때문에  false임
        System.out.println(name1.equals(name3)); // 결과 true. equals는 주소 비교가 아니라 값 비교라서  true가 나옴


    }
}
