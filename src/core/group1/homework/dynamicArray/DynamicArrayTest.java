package core.group1.homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray dy = new DynamicArray();
        System.out.println(dy.isExist(0));
        System.out.println(dy.isEmpty());

        dy.add(9);
        System.out.println(dy.isExist(9));
        System.out.println(dy.isEmpty());


        //        for (int i = 0; i < 10; i++) {
//            dy.add(i + 1);
//        }
//
//
//        int[] numbers = {11, 22, 33, 44, 55};
//        dy.add(numbers);
//
//        dy.print();



//        dy.print();
//        dy.delete(4);
//        System.out.println();
//        dy.print();
//        dy.delete(1);
//        System.out.println();
//        dy.print();
//        dy.add(11);
//        System.out.println();
//        dy.print();
//        dy.set(12, 5);
//        System.out.println();
//        dy.print();
//        dy.add(13, 6);
//        System.out.println();
//        dy.print();
//        System.out.println();
//        dy.add(44, 25);
    }

}
