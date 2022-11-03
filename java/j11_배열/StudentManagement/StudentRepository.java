package j11_배열.StudentManagement;


public class StudentRepository {
    private Student[] students;

    public StudentRepository() {
        students = new Student[0];
    }

    public void addStudent(Student student) {
        int index = indexOfEmpty();

        if(index == -1) {
            index = increaseArray();
            //Student[] tempArray = new Student[students.length +1]; increaseArray로 줄였음
        }

        students[index] = student;
    }
    //배열의 공간을 확인해줘야함.
    private int indexOfEmpty() {
        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) { // null이면 공간이 있음
                return i; // return이 안되면 indexOfEmpty 메소드를 빠져 나갈 수 없다.
            }
        }

        return -1; //-1이면 공간이 없다는 뜻임.

    }

    private int increaseArray() {
        Student[] tempArray = new Student[students.length +1];
        for (int i = 0; i < students. length; i++) {
            tempArray[i] = students[i];
        }
        students = tempArray;

        return students.length -1;
    }

    public Student[] getStudents() {
        return students;
    }

    public int findStudentByName(String name) {
        for(int i = 0; i < students.length; i++) {
            if(students[i] != null) {
                if (students[i].getName().equals(name)) { //getter 만들어줘야함  student에
                    return i;
                }
            }
        }

        return -1;
    }

    public Student getStudents(int index) {
        return students[index];
    }

    public Student removeStudent(int index) {
        Student student = students[index];
        students[index] = null;
        return student;
    }

    public Student updateStudent(int index, Student updateStudent) {
        Student student = students[index];
        student.updateStudent(updateStudent);
        return student;

    }

}
