package j11_배열.StudentManagement;


import java.util.Scanner;

public class StudentService {
    private Scanner scanner;
    private StudentRepository studentRepository;

    public StudentService(Scanner scanner, StudentRepository StudentRepository) {
        this.scanner = scanner;
        this.studentRepository = StudentRepository;
    }

    public void registerStudent() {
        String name;
        int kor;
        int eng;
        int math;

        System.out.println("[학생정보 등록]");
        System.out.print("이름: ");
        name = scanner.nextLine();
        System.out.print("국어: ");
        kor = scanner.nextInt();
        System.out.print("영어: ");
        eng = scanner.nextInt();
        System.out.print("수학: ");
        math = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(name, kor, eng, math);

        studentRepository.addStudent(student);

    }

    public void showStudents() {
        Student[] students = studentRepository.getStudents();

        for(int i = 0; i < students.length; i++) {
            Student student = students[i];
            student.showStudentInfo();

        }
    }

        private int indexOf() {
            System.out.println("이름을 입력하세요: ");
            String name;
            name = scanner.nextLine();

            return studentRepository.findStudentByName(name);
        }
        //       int index = studentRepository.findStudentByName(name);

        public void showStudent(){
            System.out.println("[학생 정보 이름으로 조회]");
            int index = indexOf();

        if(index == -1) {
            System.out.println("입력한 이름의 학생이 등록되어 있지 않습니다.");
            return;
        }

        studentRepository.getStudents(index).showStudentInfo();

    }

    public void deleteStudent() {
        System.out.println("[학생 정보 이름으로 삭제]");
        int index = indexOf();
        if(index == -1) {
            System.out.println("입력한 이름의 학생이 등록되어 있지 않습니다.");
            return;


    }

    studentRepository.removeStudent(index).showStudentInfo();
    System.out.println("삭제 완료!");
    System.out.println();

    public void modifyStudent() {

        if (index == -1) {
            System.out.println("입력한 이름의 학생이 등록되어 있지 않습니다.");
            return;
        }

        System.out.print("국어: ");
        kor = scanner.nextInt();
        System.out.print("영어: ");
        eng = scanner.nextInt();
        System.out.print("수학: ");
        math = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(null, kor, eng, math);

        studentRepository.updateStudent(index, updateStudent);
        System.out.println("수정 완료!");

    }
}

    public void modifyStudent() {
    }
