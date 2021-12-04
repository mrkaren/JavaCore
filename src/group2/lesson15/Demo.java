package group2.lesson15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {


    public static void main(String[] args) throws ParseException {
        String string = "July 2, 2010";
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");
        Date date = sdf.parse(string);
        System.out.println(date);

    }

}
