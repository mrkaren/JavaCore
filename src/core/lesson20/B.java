package core.lesson20;

public class B extends A {

    public int x = 100;

    @Override
    public void meth() {
        System.out.println("b");
    }

    @Override
    public void meth(int a) {
        System.out.println(a * a);
    }
}
