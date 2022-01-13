package core.lesson21;

public class MainThread {

    public static void main(String[] args) {
        Thread newThread = new Thread(new MyThread(), "demo thread");
        newThread.start();

        System.out.println("main thread finished");


    }

}
