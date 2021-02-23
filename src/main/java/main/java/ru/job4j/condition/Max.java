package main.java.ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int two, int three) {
        int maxFirstTwo = max(first, two);
        return max(three, maxFirstTwo);
    }

    public static int max(int first, int two, int three, int four) {
        int maxFirstTwoThree = max(first, two, three);
        return max(three, four);
    }

}