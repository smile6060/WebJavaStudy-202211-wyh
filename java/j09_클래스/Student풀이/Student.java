package j09_클래스.Student풀이;

public class Student {

    private String schoolName;
    private int studentCode;
    private int studentYear;
    private String name;

    public void increaseStudentYear() {
        studentYear++;
        if(studentYear > 5) {
            System.out.println("year" + "학년을 더하면" + studentYear + "학년을 더하면 5학년을 넘어섭니다.");
            studentYear--;
            return; // 반환 반환가치가 있을때만 사용가능한데 void에서도 리턴 사용가능 반복문 break처럼 바로 끝냄
        }
        showStudentInfo(); //리턴 만나면 호출안됨
    }

    public void increaseStudentYear(int year) {
        studentYear += year;
        if(studentYear > 5) {
            System.out.println("더 이상 학년을 증가시킬 수 없습니다.");
            System.out.println();
            studentYear -= year;
            return;
        }
        showStudentInfo();
    }

    public void showStudentInfo() {
        System.out.println("학교: " + schoolName);
        System.out.println("학번: " + studentCode);
        System.out.println("학년: " + studentYear);
        System.out.println("이름: " + name);
        System.out.println();

    }
}
