package j19_컬렉션;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentList {
    public static <students> void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        String searchName = "김규민";

        for(Student student : students) {
            if(student.getName().equals(searchName)) {
                System.out.println(searchName + " 학생의 학번: " + student.getId());
                break;
            }
        }

        for(int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if(student.getName().equals(searchName)) {
                System.out.println(searchName + " 학생의 학번: " + student.getId());
                break;
            }
        }

        int searchId = 20220002;

        for(Student student : students) {
            if(student.getId() == searchId) {
                students.remove(students.indexOf(student));
                break;
            }
        }
        // 위에꺼랑 또 다른 방법 ↓
        for(int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if(student.getId() == searchId) {
                students.remove(i);
                break;
            }
        }

        System.out.println(students);

        /*
        * id = 20220003 학생을 찾아서 그 학생의 이름이 김규민이라면 학생이름을 김경민으로 바꿔라.
        * */

        searchId = 20220003;

        for(Student student : students) {
            if(student.getId() == searchId && student.getName().equals("김규민")) {
                student.setName("김경민");
                break;
            }
        }
        System.out.println(students);

        System.out.println("------------------------------");

        for(Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        searchId = 20220004;

        /* 박경효를 박창우로 변경
         */

        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()) {
            Student student = iterator.next();
            if(student.getId() == searchId) {
                student.setName("박창우");
                        break;
            }
        }

        System.out.println(students);

        List<Student> reverseStudents = new ArrayList<Student>();
        // 거꾸로 나오게 하는 방법 1
//        for(int i = 0; i < students.size(); i++) {
//            reverseStudents.add(students.get(students.size() -1 - i));
//        }
//
//        System.out.println(reverseStudents);

// 거꾸로 나오게 하는 방법 2
        for(Student student : students) {
            reverseStudents.add(0, student);
        }

        System.out.println(reverseStudents);

        Collections.reverse(reverseStudents);

        System.out.println(reverseStudents);

        /*
        idList
        nameList
        학생들 id값 정열
        학생들 name값 정열
         */

       List<Integer> idList = new ArrayList<Integer>();
       List<String> nameList = new ArrayList<String>();

       for(Student student : students) {
           idList.add(student.getId());
           nameList.add(student.getName());
       }

        System.out.println(idList);
        System.out.println(nameList);

        students.clear();

        System.out.println(students);
//  없어진 students에 값 넣으시오.
        for(int i = 0; i < idList.size(); i++) {
            Student student = new Student(idList.get(i), nameList.get(i));
            students.add(student);
        }
        System.out.println(students);
    }
}