package group1.classwork;

public class ArrayExample {

    public static void main(String[] args) {

        //գտնել մասիվի կրկնվող էլեմենտները
        //result:

        //5-ը կրկնվում է
        //2-ը կրկնվում է

//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    System.out.println(array[i] + "-ը կրկնվում է");
//                    break;
//                }
//            }
//        }

        // պետք է տպենք true եթե մասիվի բոլոր էլեմենտները զույգ են

        int[] array = {8, 4, 2, 8, 8, 2, 6, 10};

        boolean isEven = true;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                isEven = false;
                break;
            }
        }

        System.out.println(isEven);


    }

}
