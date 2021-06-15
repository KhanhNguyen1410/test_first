package com.example.testfirst.lambda;

import com.example.testfirst.Calender;
import com.nimbusds.oauth2.sdk.util.StringUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PrinterIPL implements Printer{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
//
//    @Override
//    public void test(Integer integer,  String s) {
//        System.out.println(integer);
//        System.out.println(s);
//    }
public static void main(String[] args) {
//        long d = 85;
//        BigDecimal a = new BigDecimal("5");
//        BigDecimal b = new BigDecimal("4");
//        BigDecimal b2 = new BigDecimal(d);
//        BigDecimal c = a.add(b);
//        BigDecimal c2 = a.add(b2);

  String  a = "";
  String b = "";
  if (a.isEmpty()){
    System.out.println("ok");
  } if (StringUtils.isNotBlank(b)){
    System.out.println("askdasd");
  }
//    System.out.println(c);
//    System.out.println(c2);

//
//  SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//  String dateInString = "22-01-2015 10:20:56";
//  Date date = sdf.parse(dateInString);
//  DateAndCalendar obj = new DateAndCalendar();
//
//  //2. Test - Convert Date to Calendar
//  Calendar calendar = obj.dateToCalendar(date);
//  System.out.println(calendar.getTime());

}
}
