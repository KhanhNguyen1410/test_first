package com.example.testfirst;

import lombok.var;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class Calender {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1614560166L * 1000);
        long beginHoursOfDate ;
        calendar.set(Calendar.HOUR,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        beginHoursOfDate = calendar.getTimeInMillis()/1000;
        System.out.println(calendar.getTime());
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR,23);
        c.set(Calendar.MINUTE,59);
        c.set(Calendar.SECOND,59);
        long lastHoursInDate = calendar.getTimeInMillis() /1000;
        System.out.println(c.getTime());
    }
}
