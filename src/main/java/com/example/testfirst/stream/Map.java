package com.example.testfirst.stream;




import java.util.*;
import java.util.stream.Collectors;

public class Map {

        public static void main(String[] args) {
            List<Integer> data = Arrays.asList(1,2,3,4,5);
//            List<Integer> data2 = Arrays.asList(5,4,6,7,8);
//           data.stream().filter(integer -> data2.contains(integer)).forEach(integer -> data.remove(integer));
//          for (int i = 0; i < data.size(); i++) {
//            System.out.println(data);

          Date d = new Date(1602090000L * 1000);
          Calendar calendar2 = Calendar.getInstance();
          calendar2.set(Calendar.YEAR, 2021);
          calendar2.set(Calendar.MONTH, 1);
          calendar2.set(Calendar.HOUR_OF_DAY, 0);
          calendar2.set(Calendar.MINUTE, 0);
          calendar2.set(Calendar.SECOND, 1);
//          System.out.println(d);
          Calendar calendar = Calendar.getInstance();
          calendar.setTime(d);
          System.out.println(calendar.getTime());
        }

    }

