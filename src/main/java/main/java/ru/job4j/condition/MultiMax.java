package main.java.ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        result = third > result ? third : result;
        return result;
    }
}