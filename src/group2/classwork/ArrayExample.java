package group2.classwork;

public class ArrayExample {

    public static void main(String[] args) {


        //տպել թե որ էլեմենտներն են կրկնվում

        // 3-ը կրկնվում է
        // 6-ը կրկնվում է

//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    System.out.println(array[i] + "-ը կրկնվում է");
//                    break;
//                }
//            }
//        }

        int[] array = {3, 6, 7, 9, 2, 3, 6, 13, 4, 5, 3};

        //տպել true եթե մասիվի բոլոր էլեմենտները զույգ են։
        //եթե ոչ՝ false

        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result = false;
                break;
            }
        }
        System.out.println(result);


    }

}
