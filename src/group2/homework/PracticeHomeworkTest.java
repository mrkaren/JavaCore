package group2.homework;

public class PracticeHomeworkTest {

    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();

        System.out.println(ph.calcAge(10));
        System.out.println(ph.convert(1));
        System.out.println(ph.isSameNum(5, 5));
        System.out.println(ph.reverseBool(true));
        System.out.println(ph.lessThanOrEqualToZero(-5));
        System.out.println(ph.nextNumber(5));
        int[] array1 = {4, 5, 6};
        int[] array2 = {7, 8, 9, 10, 11, 23};
        System.out.println(ph.maxLength(array1, array2));

    }

}
