package com.springboot.springbootmusicplus.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
    public static String getTimes(){
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String times=sdf.format(new Date());
        return times;
    }

}
