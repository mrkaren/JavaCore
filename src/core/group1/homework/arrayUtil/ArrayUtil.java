package core.group1.homework.arrayUtil;

public class ArrayUtil {


    int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    void print(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
