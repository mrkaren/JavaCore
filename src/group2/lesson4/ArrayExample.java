package group2.lesson4;

public class ArrayExample {

    public static void main(String[] args) {
        int numbers[] = new int[50000];
//        numbers = new int[40];
//        System.out.println(numbers[numbers.length-1]);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }

        numbers = new int [500000];


    }

}
