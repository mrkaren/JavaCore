package core.lesson15;

public interface Callback {

    int EXIT = 7;

    void callback();

    default void method1() {
        System.out.println("kuku");
    }

    static void method2(){
        System.out.println("kuku from static method");
    }

}
