package j23_예외;

import lombok.Getter;

import java.util.Map;

public class CustomException extends RuntimeException {

    @Getter
    private Map<String, String> errorMap;

    public CustomException(String message, Map<String, String> errorMap) { // alt+Insert -> constructor
        super(message);
        this.errorMap = errorMap;
    }
}
