package core.group1.lesson13;

public class Outer {

    static int a = 4;

    void test() {
        System.out.println("Outer.test");
    }

     static class Inner {
        int b = 34;

        void showA() {
//            test();
            System.out.println(a);
        }
    }

}
