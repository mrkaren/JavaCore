package core.lesson15;

public class CallbackImpl implements Callback{

    @Override
    public void callback() {
        System.out.println("from impl 1");
    }

    @Override
    public void method1() {
        System.out.println("from method 1 in CallbackImpl");
    }

    void method4(){

    }
}
