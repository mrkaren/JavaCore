package core.lesson20;

public class Test {

    public static void main(String[] args) {
        A a = new B();
//        System.out.println(a.x);
        a.meth();
        a.meth(6);

        B b = (B) a;
        System.out.println(b.x);
    }

}
