package core.lesson22;

public class RunnableExample {

    public static void main(String[] args) throws InterruptedException {

        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println();
            }
        };

        Thread thread = new Thread(t1);

        thread.start();

        for (int i = 0; i < 40; i++) {
            System.out.println("main " + i);
            Thread.sleep(1000);
        }

    }

}
