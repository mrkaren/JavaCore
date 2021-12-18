package core.homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray dy = new DynamicArray();

        System.out.println(dy.isEmpty());
        dy.add(5);
        System.out.println(dy.isEmpty());
        int[] numbers = {33, 44, 55};

        dy.add(numbers);

        dy.print();

        dy.add(66, 2);

        dy.print();

        System.out.println(dy.isExists(66));
    }

}
