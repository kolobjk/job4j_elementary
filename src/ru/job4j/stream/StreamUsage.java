package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(-10, 20, 30, 40));
        List<Integer> posList = list.stream().filter((el) -> el > 0).collect(Collectors.toList());
        posList.forEach(System.out::println);
    }
}
