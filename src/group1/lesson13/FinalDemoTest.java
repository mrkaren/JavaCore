package group1.lesson13;


public class FinalDemoTest {

    public static void main(String[] args) {

        final int[] numbers = {3, 4, 5, 6};

        System.out.println(numbers[0]);
        numbers[0] = 30;
        System.out.println(numbers[0]);
        numbers[0] = 40;
        System.out.println(numbers[0]);

//        numbers = new int[20];

    }

}
