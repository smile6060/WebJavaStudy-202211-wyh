package j04_연산자;

public class Operation5 {
    public static void main(String[] args) {
        int totalCount = 102;
        int maxPage = totalCount % 10 == 0? totalCount / 10 : totalCount / 10 + 1;//? 아니면 :
// 1번째꺼가 참이니? 아니면 그다음? 그것도 아니면 : 이 다음!!! 삼항연산자 어렵다ㅜㅜ
        int page = 12;
        int startIndex = page % 5 == 0 ? page -4 : page -(page % 5) + 1; //삼항연산자
        int endIndex = startIndex + 4 <= maxPage ? startIndex = 4 : maxPage;
        // 마지막 페이지 보다 작아야지만 4 크면은 maxPage를 보여줘라

        System.out.println("page: " + page);
        System.out.println("starIndex: " + startIndex);
        System.out.println("endIndex: " + endIndex);

        String isMaxIndexStr = page == endIndex ? "마지막 인덱스입니다." : "마지막 인덱스가 아닙니다.";
        // page가 endIndex랑 같니??? 아니면 마지막 인덱스입니다.
        System.out.println(isMaxIndexStr);
    }
}
