package j18_제네릭.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()
                .email("skjil1128@gamil.com")
                .username("junil")
                .build();

        System.out.println(user);

        User2 user2 = User2.builder()
                .name("김준일")
                .build();

        System.out.println(user2);

        User u = User2.to();
        System.out.println("u");

    }
}
