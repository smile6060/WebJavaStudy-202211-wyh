package j16_Bean;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //final만 가능
@AllArgsConstructor
public class PersonRequired {
    private final String name;
    private int age;

}
