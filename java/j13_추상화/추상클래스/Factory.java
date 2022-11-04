package j13_추상화.추상클래스;

public abstract class Factory {
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    public abstract void produce(String model); //abstract  구현구 없이 세미콜론으로함.
    public abstract void management();

 //추상클래스 why? abstract가(추상클래스) 클래스에 정의되면 추상클래스이다.
//    추상 클래스는 생성할 수 없다. Factory factory = new Factory(); 요거 못함.
//    그 외의 다른 특징은 일반 클래스와 동일하다.


        public String getName() {
            return name;
        }

//        public void setName(String name) {
//            this.name = name;
//        }

        public void printInfo() {
            System.out.println("공장의 정보를 출력합니다.");
            System.out.println("공장이름: " + name);
        }
    }

