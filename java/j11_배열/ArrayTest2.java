package j11_배열;

import java.util.Scanner;

public class ArrayTest2 {

    public static void main(String[] args) {
        /*
         * 1. 10명의 학생 이름을 담을 수 있는 studentNames 배열을 만든다.
         * [출력결과]
         * 1.정빈
         * 2.김규민
         * 3.박경효
         * 4.김혜진
         * 5.김지향
         * 6.전병욱
         * 7.윤도영
         * 8.이성욱
         * 9.홍성욱
         * 10.박민화
         * */



        String[] studentNames = new String[10];

        studentNames[0] = "정빈";
        studentNames[1] = "김규민";
        studentNames[2] = "박경효";
        studentNames[3] = "김혜진";
        studentNames[4] = "김지향";
        studentNames[5] = "전병욱";
        studentNames[6] = "윤도영";
        studentNames[7] = "이성욱";
        studentNames[8] = "홍성욱";
        studentNames[9] = "박민화";


        for (int i = 0; i < 10; i++) {
            System.out.println(studentNames[i]);
        }
    }
}