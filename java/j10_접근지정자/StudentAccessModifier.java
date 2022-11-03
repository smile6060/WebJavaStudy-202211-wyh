package j10_접근지정자;

public class StudentAccessModifier {

    private int code;
    private String name;

    public StudentAccessModifier(int code, String name) { // 다른패키지에 있으면 생성못함. 이유는 default가 숨겨져있기 때문. default는 표기 안함
        this.code = code;
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("학번:" + this.code);
        System.out.println("이름:" + name);
    }
}
