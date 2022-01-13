package core.lesson21;

public class MyThread implements Runnable{


    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("docherni potok " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("docherni potok zavershon");
    }
}
