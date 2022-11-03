package j10_접근지정자.캡슐화;

public class StudentService {

    public void regisStudent() {
        System.out.println("[ 학생 정보 등록 메뉴 ]");
        System.out.println("먼저 중복된 학생 정보인지 확인합니다.");
        doubleCheckStudent("김준일");
        System.out.println("학생 정보를 등록합니다.");
    }

    private boolean doubleCheckStudent(String studentName) { // private 메소드는 이 안에서만 사용되는 메소드이다.

        if (studentName.equals("김준일")) {
            return false; // 문자열에서 같은거 비교할때 사용 "" == "" 이거랑 동일
        }

        return true;

    }
}
