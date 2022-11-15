package j25_문자열;

public class String1 {
    public static void main(String[] args) {
        // 프로젝트 확장자 파일명 추려내야함.
        /*
        subString() -> 문자열을 잘라준다.
        indexOf() -> 내가 찾는 문자열의 위치 인덱스를 반환
        코드 재사용가능해야함
         */


        String filePath = "C/Users/junil/java-study/src/main/java/String.java";
        String filePath2 = "C/Users/junil/project/java-study2/src/main/java/Integer/String.java";

//        String projectName = "java-study";
//        String fileName = "String";
//        String extension = ".java";

        int srcIndex = filePath.indexOf("/src");
        String projectPath = filePath.substring(0,srcIndex);

        String projectName = projectPath.substring(projectPath.lastIndexOf("/") + 1);
        String fileName = filePath.substring(filePath.lastIndexOf("/") + 1, filePath.lastIndexOf("."));
        String extension = filePath.substring(filePath.lastIndexOf("."));

        System.out.println("프로젝트명: " + srcIndex);
        System.out.println("파일명: " + projectPath);
        System.out.println("확장자명: " + extension);

    }
}
