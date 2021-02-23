package main.java.ru.job4j.lambda;

import java.util.Comparator;

public class StringLampda {
    public static void main(String[] args) {
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("The size of left string is " + left.length() + " The size of right string is" + right.length());
            return Integer.compare(right.length(), left.length());
        };
    }
}
