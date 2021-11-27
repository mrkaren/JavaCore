package group2.lesson14;

import java.util.Locale;

public class Demo {

    public static void main(String[] args) {
        Object a = new Integer(5);

        if(a instanceof String){
            String str = (String) a;

            System.out.println(str.toUpperCase());
        }

    }

}
