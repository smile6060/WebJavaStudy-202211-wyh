package j18_제네릭.빌더;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User2 {
    private String username;
    private String password;
    private String email;
    private String name;

    public User to() {
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }
}
