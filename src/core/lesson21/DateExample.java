package core.lesson21;

import java.util.Date;

public class DateExample {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        //
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println(System.currentTimeMillis());
    }

}
