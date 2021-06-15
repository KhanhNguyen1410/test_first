package com.example.testfirst.lambda;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Demo {

  public static void test(Printer printer) {
    printer.print("ok bro");
  }

  public static void main(String[] args) throws ParseException {

    Calendar date = Calendar.getInstance();
    Calendar ti = Calendar.getInstance();
//    System.out.println(date);
//    date3.set(Calendar.HOUR_OF_DAY, 9);
//    date3.set(Calendar.MINUTE, 30);
//    date.getTime();

    Date time = Calendar.getInstance().getTime();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
    String strDate = dateFormat.format(time);
    String ngay = strDate +" 9:30:00";
    Date da =new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse(ngay);
    System.out.println(da);
    date.setTime(da);
    if (ti.after(date)){
      System.out.println("ding");
    }
    System.out.println(date.getTime());
    //    Date time = date.getTime();
//    DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
//    // Số giây.
//    long second = 125553;
//
//    long minute = TimeUnit.MINUTES.convert(second, TimeUnit.SECONDS);
//    System.out.println("Minute " + minute);

Date date1 = new Date();
//date1.set
//    System.out.println(date1);

    String s = "khanhvhasdkjskgda.com";
    //        String s1 = s.split("@")[0];
    //        System.out.println(s1);
    //        String[] arr = { "Java", "C++", "PHP", "Python" };
    //        String[] arr2 = { "1", "2", "3", "4" };
    //        List<String> list = Arrays.asList(arr);
    //        List<String> list2 = Arrays.asList(arr2);
    //        list.addAll(list2);
    //        System.out.println(list);
    //String s = "1,2,3,4,5,6,7";

    //
    //        BigDecimal bigDecimal = BigDecimal.ZERO;
    //        BigDecimal bigDecimal2 = BigDecimal.ZERO;
    //        BigDecimal bigDecimal1 = BigDecimal.ZERO;
    //        bigDecimal2 = bigDecimal.add(bigDecimal1);
    //        System.out.println(bigDecimal2);
    //        boolean b = true;
    //        boolean c = false;
    //
    //        if (b && !c ){
    //            System.out.println("đẳng cấp");
    //        }
    ////        System.out.println(bigDecimal1.multiply(bigDecimal));
    //        if (bigDecimal.compareTo(bigDecimal1) == 0){
    //            System.out.println(bigDecimal);
    //        }

  }
}
