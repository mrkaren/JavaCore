package group2.homework.author.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static String dateToString(Date date){
        return sdf.format(date);
    }

    public static Date stringToDate(String dateStr) throws ParseException {
        return sdf.parse(dateStr);
    }
}
