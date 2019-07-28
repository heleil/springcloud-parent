package com.czjk.api.number;

import java.math.BigDecimal;

public class NumberUtils {
    public static double formateDouble(double num,int scale){
        BigDecimal bd = new BigDecimal(num);
        return bd.setScale(scale,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
