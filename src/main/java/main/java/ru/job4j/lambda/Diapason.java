package main.java.ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Diapason {
    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rs1 = new ArrayList<>();
        for (int i = start; i < end; i++) {
            rs1.add(func.apply((double) i));
        }
        return rs1;
    }
}
