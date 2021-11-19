package group2.lesson6;

public class StringArrayExample {

    public static void main(String[] args) {

        String[] names = new String[3];

        names[0] = "Poxos";
        names[1] = "Petros";
        names[2] = null;

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


    }
}
