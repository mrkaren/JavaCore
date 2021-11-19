package group2.homework.arrayUtil;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {2, 5, 6, 7, 2, 4, 5, 7, 89, 2, 1};
        arrayUtil.print(array);
        int[] array2 = {2, 555, 6, 7, 2, 4, 5, 7, 89, 2, 1};
        arrayUtil.print(array2);
        int arrayMax = arrayUtil.max(array);
        int array2Max = arrayUtil.max(array2);

        if (arrayMax > array2Max) {
            System.out.println("մեծ թիվը array-ի մեջն է" + arrayMax);
        } else {
            System.out.println("մեծ թիվը array2-ի մեջն է" + array2Max);

        }
    }

}
