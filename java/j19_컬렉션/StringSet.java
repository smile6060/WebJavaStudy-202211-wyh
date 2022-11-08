package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        strList.add("이동빈");
        strList.add("이승아");
        strList.add("우예희");
        strList.add("이종준");
        strList.add("변상원");
        strList.add("김준일"); // 중복이라 결과에 한번밖에 안나옴.
        // set을 사용하는 이유 : 중복 제거하기 위해 많이 사용

        // 값 추가
        Set<String> strSet = new HashSet<String>();
        strSet.add("김준일");
        strSet.add("장혜민");
        strSet.add("정순동");
        strSet.add("김완준");
        strSet.add("송아셀");

        System.out.println(strSet);
        strSet.addAll(strList);
        System.out.println(strSet);

        // 값 조회
        String searchName = "김준일";

        /*
         strSet에 김준일이 있으면  true, 없으면 false
         */
        boolean isTrue = false;

        for(String name : strSet) {
            if(name.equals(searchName)) {
                isTrue = true;
                break;
            }
        }

        System.out.println(isTrue);

        // 값 수정
        /*
        송아셀 이름을 찾아서 남강석으로 바꿔라
         */
        searchName = "송아셀";

        for(String name : strSet) {
            if(name.equals(searchName)) {
                strSet.remove(searchName);
                strSet.add("남강석");
                break;
            }
        }

        System.out.println(strSet);

        searchName = "김준일";

        System.out.println(strSet.contains(searchName));

        if(strSet.contains(searchName)) {
            strSet.remove(searchName);
            strSet.add("김준이");
        }
        System.out.println(strSet);

    }
}
