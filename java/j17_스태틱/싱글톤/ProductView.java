package j17_스태틱.싱글톤;

import j17_스태틱.Product;

public class ProductView {
    private static ProductView instance = null; // instance는 ProductView의 주소값을 담을 수 있다.

    private ProductView () {}

    public static ProductView getInstance() { // getInstance = getter의미 밖으로 빼낼 수 있다.
        if(instance == null) {
            instance = new ProductView();
        }
        return instance;
    } //여기까지 싱글톤 공식이다.

    public void showMainView() {
        System.out.println("상품 정보를 보여주는 메인 화면");
    }

    public void showOrderView() {
        System.out.println("주문 정보를 보여주는 화면");
    }
}
