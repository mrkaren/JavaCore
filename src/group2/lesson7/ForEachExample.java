package group2.lesson7;

public class ForEachExample {

    public static void main(String[] args) {
        int[] array = {1, 6, 4, 55, 64, 23};

        int x = 9;
        boolean isFound = false;
        for (int a : array) {
            if (a == x) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound);
    }

}
