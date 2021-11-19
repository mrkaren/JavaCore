package group1.homework.arrayUtil;


public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] numbers = {3, 6, 8, 1, 3};
        System.out.println("առաջին մասիվ՝");
        arrayUtil.print(numbers);
        int maxOfNumbers = arrayUtil.max(numbers);


        int[] numbers2 = {23, 56, 34, 23, 12, 35};
        System.out.println("երկրորդ մասիվ՝");
        arrayUtil.print(numbers2);

        int maxOfNumbers2 = arrayUtil.max(numbers2);

        if (maxOfNumbers > maxOfNumbers2) {
            System.out.println("ամենամեծը առաջին մասիվի մեջ է - " + maxOfNumbers);
        } else {
            System.out.println("ամենամեծը երկրորդ մասիվի մեջ է - " + maxOfNumbers2);

        }
    }

}
