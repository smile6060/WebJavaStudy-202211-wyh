package j17_스태틱.싱글톤;

public class ViewMain {

    public static void main(String[] args) {
//        ProductView productview = new ProductView.getInstance(); // 생성자가 프라이빗이라서 생성할 수 없다.
        ProductView.getInstance().showMainView();
        ProductView.getInstance().showOrderView();

    }
}
