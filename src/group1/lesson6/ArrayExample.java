package group1.lesson6;


public class ArrayExample {

    public static void main(String[] args) {
        //հայտարարել մասիվ 10 էլեմենտանի

        //Տարբերակ 1
        int[] nums = {1, 5, 8, 90, 5, 43, 23, 56};

        //Տարբերակ 2
        char[] name = new char[5];
        name[0] = 'P';
        name[1] = 'o';
        name[2] = 'x';
        name[3] = 'o';
        name[4] = 's';

        //տպել մասիվի բոլոր էլեմենտները

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        //տպել թե քանի հատ o կա name մասիվի մեջ։

        int count = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i] == 'P' || name[i] == 'o') {
                count++;
            }
        }
        System.out.println("count = " + count);


        String[] names = new String[4];
        names[0] = "Petros";
        names[1] = "Martiros";
    }

}
