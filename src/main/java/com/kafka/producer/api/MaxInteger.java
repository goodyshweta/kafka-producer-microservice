package com.kafka.producer.api;

import java.util.Arrays;
import java.util.List;

public class MaxInteger {

    public static void main(String[] args)
    {

        // Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        List<Integer> elist = Arrays.asList(1,5,8,9);

        System.out.print("The maximum value is : ");

        // Using stream.max() to get maximum
        // element according to provided Comparator
        // and storing in variable var
        Integer var = list.stream().mapToInt(x->x).max().getAsInt();

        System.out.print(var);
    }
}
