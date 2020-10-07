package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        Integer[][] matrix = new Integer[][]{{1, 2}, {3, 4}, {5, 6}};
        List<Integer> result = Stream.of(matrix)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
