package group1.lesson4;

public class ArrayExample {

    public static void main(String[] args) {
        int[] array = {5,9,7};
        int[] numbers = new int[150000];
        int[] numbers1 = new int[4];
        //add numbers to array
        int index = 0;
        for (int i = numbers.length; i > 0; i--) {
            numbers[index] = i;
            index = index + 1;

        }
        //print numbers of array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        numbers = new int[10];
        System.out.println(numbers[1]);
//        int[] array = {1, 8, 9, 5};
//        array = new int[5];
//
//        System.out.println(array[0]);
//
//        array[0] = 7;
//        System.out.println(array[0]);
    }

}
