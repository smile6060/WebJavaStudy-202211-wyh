package j17_스태틱;

import j08_메소드.Method1;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductMain {
    private String name;

    public static void main(String[] args) {
        Product[] products = new Product[5];
//                1.serialNumber = 20220001, productName = "스타벅스 블랙 텀블러1"
//                2.serialNumber = 20220002, productName = "스타벅스 블랙 텀블러2"
//                3.serialNumber = 20220003, productName = "스타벅스 블랙 텀블러3"
//                4.serialNumber = 20220004, productName = "스타벅스 블랙 텀블러4"
//                5.serialNumber = 20220005, productName = "스타벅스 블랙 텀블러5"
//        시리얼넘버 자동증가해야함

//        for(int i = 0; i < products.length; i++) {
//            products[i] = new Product("스타벅스 블랙 텀블러" + (i + 1));
//        }
//
//        products[0] = new Product("스타벅스 블랙 텀블러" + + 1);
//        products[1] = new Product("스타벅스 블랙 텀블러" + + 2);
//        products[2] = new Product("스타벅스 블랙 텀블러" + + 3);
//        products[3] = new Product("스타벅스 블랙 텀블러" + + 4);
//        products[4] = new Product("스타벅스 블랙 텀블러" + + 5);
//
//        for(int i = 0; i < products.length; i++) {
//            System.out.println(products[i]);
//        }

        int autoIncrement = Product.getAutoIncrement();
        System.out.println(autoIncrement);
        System.out.println(Product.getAutoIncrement());
        Product.autoIncrement++;
        System.out.println(Product.getAutoIncrement());

        Product p1 = new Product("p1");
        System.out.println(p1.getAutoIncrement());
        Product p2 = new Product("p1");
        Product p3 = new Product("p1");
        Product p4 = new Product("p1");
        Product p5 = new Product("p1");
        System.out.println(p1.getAutoIncrement()); // 결과 20220006
        System.out.println(p2.getAutoIncrement()); // 결과 20220006
        System.out.println(p3.getAutoIncrement()); // 결과 20220006
        System.out.println(p4.getAutoIncrement()); // 결과 20220006
        System.out.println(p5.getAutoIncrement()); // 결과 20220006
        System.out.println(Product.getAutoIncrement()); // 결과 20220006

        System.out.println(PathRepository.PRODUCT_IMG_PATH);
        System.out.println(PathRepository.PROFILE_IMG_PATH);
        System.out.println(PathRepository.MAIN_IMG_PATH);

        Product.printInfo();

        ProductMain productMain = new ProductMain();

        productMain.setName("테스트");
        System.out.println(productMain.getName());

        Method1.main(new String[] {}); // 메소드1에 있는거 쓸 수 있다. static이기 때문이다.
        Method1.call1();

    }

}
