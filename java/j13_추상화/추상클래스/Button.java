package j13_추상화.추상클래스;

import j13_추상화.인터페이스.Down;
import j13_추상화.인터페이스.Press;
import j13_추상화.인터페이스.Up;

public abstract class Button implements Press, Up, Down {

    @Override
    public void onDown() {}

    @Override
    public void onPressed() {}

    @Override
    public void onUp() {}
}
