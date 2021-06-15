package com.example.testfirst.stream;

import lombok.var;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collectors {
    public static void main(String[] args) {
//        Movies movies = new Movies("a",10);
//        Movies movies2 = new Movies("b",20);
//        Movies movies5 = new Movies("e",20);
//        Movies movies3 = new Movies("c",30);
//        Movies movies4 = new Movies("d",40);
//        List<Movies> moviesList = new ArrayList<>(Arrays.asList(movies,movies2,movies3,movies4,movies5));
//        var result = moviesList.stream().map(Movies::getTitle).noneMatch(m -> m.equals("a"));
//        long totalAmount = moviesList.stream().map(Movies::getLike).mapToInt(amount -> amount).sum();
//        System.out.println(totalAmount);

            BigDecimal bigDecimal = BigDecimal.valueOf(2);
            BigDecimal bigDeci = BigDecimal.valueOf(8su);
        System.out.println(bigDeci.subtract(bigDecimal));
    }


}
