package com.czjk.api.time;

import org.apache.commons.lang3.time.FastDateFormat;

import java.text.ParseException;
import java.util.Date;

public class DateUtils {
    public static FastDateFormat time_df = FastDateFormat.getInstance("yyyy-MM-dd hh:mm:ss.S");

    public static Date parseTime(String str){
        try {
            return time_df.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
