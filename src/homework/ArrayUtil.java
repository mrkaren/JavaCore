package homework;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {3, 6, 22, 14, 88, 65, 333, 6, 4, 1};

        System.out.println(array[6]);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("--------------");
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);

        System.out.println("print only evens");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.println("print only odds");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();
        int countOfEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEven++;
            }
        }
        System.out.println("count of even:" + countOfEven);

        System.out.println();
        int countOfOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOfOdd++;
            }
        }
        System.out.println("count of odd number:" + countOfOdd);

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum : " + sum);
        System.out.println("avg : " + sum / array.length);



    }

}
