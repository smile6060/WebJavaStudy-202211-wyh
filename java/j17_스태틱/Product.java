package j17_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
// static은 공유하는 영역이다.
@Data
public class Product {
    public static int autoIncrement = 20220000;
    
    private int serialNumber = 20220001;
    private String productName;

    public Product(String productName) {
        serialNumber = ++autoIncrement;
        this.productName = productName;
    }
    
    public static int getAutoIncrement() {
        return autoIncrement;
    }

    public static void printInfo() {
//        System.out.println(productName); 멤버변수는 static 메소드에서 사용할 수 없다. why? static은 메모리 생성을 미리 하기 때문 따라서 static 변수만 사용가능하다.
        Product product = new Product("product");
        System.out.println(product.productName);
        System.out.println(autoIncrement);

        System.out.println(autoIncrement);

        Product.printInfo();

    }
    
}
