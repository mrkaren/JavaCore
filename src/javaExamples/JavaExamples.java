package javaExamples;

public class JavaExamples {

    public static void main(String[] args) {
        int[] array1 = {2, 3, 4, 5, 4, 2, 3, 7, 5};
        int[] array2 = {5, 30, 44, 53, 24, 21, 36, 9};
//        duplicate(array1);
        duplicate1(array1, array2);
    }

    static void duplicate(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] == array[i]) {
                    System.out.println(array[i]);
                }
            }
        }
    }

    static void duplicate1(int[] array1, int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
