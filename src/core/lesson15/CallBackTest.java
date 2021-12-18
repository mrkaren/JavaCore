package core.lesson15;

public class CallBackTest {

    public static void main(String[] args) {

        Callback callback = new CallbackImpl();

        callback.callback();

        callback.method1();

    }
}
