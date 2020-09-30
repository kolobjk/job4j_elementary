package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] leftSplit = o1.split("/");
        String[] rightSplit = o2.split("/");
        int compare = rightSplit[0].compareTo(leftSplit[0]);
        if (compare != 0) {
            return compare;
        }
        for (int i = 1; i < leftSplit.length && i < rightSplit.length; i++) {
            compare = leftSplit[i].compareTo(rightSplit[i]);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(leftSplit.length, rightSplit.length);
    }
}