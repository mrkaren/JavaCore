package core.lesson21;

public class CurrentThreadExample {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("before change" + t);
        t.setName("my Thread");
        System.out.println("after change" + t);

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
