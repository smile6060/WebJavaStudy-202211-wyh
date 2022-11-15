package j25_문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String4 {
    public static void main(String[] args) {

        String roleString = "ROLE_USER,ROLE_MANAGER,ROLE_ADMIN,TESTER";
        String[] roleArray = roleString.split(","); // split을 배열로 만드는거



        List<String> roleList = Arrays.asList(roleArray);
        // List로 변환 Arrays사용하면 반복 필요없음.
//        for(String role : roleArray){
//            roleList.add(role);
//        }
        List<String> validRoleList = new ArrayList<String>();
        List<String> validRoleList2 = new ArrayList<String>();

        roleList.forEach(role -> {
            if(role.startsWith("ROLE")) {
                validRoleList.add(role);
            }
        });

        System.out.println(validRoleList);

        roleList.forEach(role -> {
           if(role.endsWith("MANAGER") || role.endsWith("ADMIN")) {
               validRoleList2.add(role);
           }
        });

        System.out.println(validRoleList2);

    }
}
