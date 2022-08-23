package com.kafka.producer;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,22,35,46,50,68,75);
        System.out.println(list.stream()
                .filter(integer -> integer%5==0)
                .map(integer -> integer*2)
                .findFirst()
                .orElse(0));
    }
}
