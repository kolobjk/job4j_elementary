package main.java.ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.isBlank()) {
                    start = el;
                    tmp.add(start);
                } else {
                    start += "/" + el;
                    tmp.add(start);
                }
            }
        }
        List<String> result = new ArrayList<>(tmp);
        result.sort(new DepDescComp());
        return result;
    }

}