package homework;

public class PracticeHomeworkTest {

    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();

        System.out.println(ph.convert(50));
        System.out.println(ph.calcAge(13));
        System.out.println(ph.isSameNum(4, 5));
        System.out.println(ph.lessThanOrEqualToZero(-5));
        int[] array1 = {4, 6, 7};
        int[] array2 = {5, 6, 7, 8, 9};
        System.out.println(ph.maxLength(array1, array2));
        System.out.println(ph.reverseBool(true));
    }
}
