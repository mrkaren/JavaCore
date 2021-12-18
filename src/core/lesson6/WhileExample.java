package core.lesson6;

public class WhileExample {

    public static void main(String[] args) {
        int i = 100;
        int j = 200;

        while (++i < --j);
        System.out.println("i = "+ i);
    }
}
