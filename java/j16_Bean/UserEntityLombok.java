package j16_Bean;

import lombok.*;
import java.util.Objects;

    @NoArgsConstructor
    @AllArgsConstructor
//    @Getter
//    @Setter
//    @EqualsAndHashCode
//    @ToString
    @Data // Getter, Setter, EqualsAndHashCode, ToString 하나로 묶어줌
    public class UserEntityLombok {
    private String username;
    private String password;
    private String email;
    private String name;

    }
