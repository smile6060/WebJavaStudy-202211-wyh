package j13_추상화.인터페이스;

public abstract class Button implements Press, Up, Down {
    @Override
    public void onDown() {}

    @Override
    public void onPressed() {}

    @Override
    public void onUp() {}
}