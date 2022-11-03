package j16_Bean;

import lombok.ToString;

import javax.annotation.processing.Generated;
import java.util.Objects;

    @NoArgsConstructor //아규먼트가 없다. 매개변수가 전부 다 있다.
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
