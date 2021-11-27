package group2.homework.author;

public class ArrayUtil {

    static void deleteByIndex(Object[] array, int index, int size) {
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
    }

}
