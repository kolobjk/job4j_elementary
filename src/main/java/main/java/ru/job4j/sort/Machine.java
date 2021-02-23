package main.java.ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int diff = money - price;
        for (int i = 0; i < COINS.length; i++) {
            while (diff - COINS[i] >= 0) {
                rsl[size] = COINS[i];
                size++;
                diff -= COINS[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}