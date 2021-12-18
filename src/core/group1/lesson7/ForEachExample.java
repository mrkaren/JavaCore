package core.group1.lesson7;

public class ForEachExample {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 7, 8};

        int x = 70;
        boolean b = false;
        for (int a : numbers) {
            if (a == x) {
                b = true;
                break;
            }

        }
        System.out.println(b);

    }

}
