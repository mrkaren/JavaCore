package group2.lesson6;

public class ArrayExample {

    public static void main(String[] args) {

        //Հայտարարել թվերի մասիվ
        int[] numbers = {4, 6, 8, 9, 2};

        // հայտարարել սինվոլների մասիվ
        char[] name = {'p', 'o', 'o', 'x', 'o', 's', 'o'};

        int countOfO = 0;
        int countOfP = 0;
        for (int i = 0; i < name.length; i++) {
            char c = name[i];
            if (c == 'o') {
                countOfO++;
            }
            if (c == 'p') {
                countOfP++;
            }
        }
        System.out.println("count of o= " + countOfO);
        System.out.println("count of p= " + countOfP);

    }

}
