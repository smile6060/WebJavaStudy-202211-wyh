package j17_스태틱.싱글톤;

import lombok.Getter;

public class Samsung { // Samsung 클래스는 Object 클래스를 상속받고 있다.
    
    @Getter
    private String company;
    private int serialNumber;

    private static Samsung instance = null;

    private Samsung () {
        company = getClass().getSimpleName();
        serialNumber = 20220000;
    }

    public static Samsung getInstance() {
      if(instance == null) {
          instance = new Samsung();
      }
      return instance;
    }

    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;
    }

}
