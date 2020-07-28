package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        boolean[] flags = new boolean[1000];
        String[] names = new String[5];
        names[0] = "Вася";
        names[1] = "Коля";
        names[2] = "Петя";
        names[3] = "Вова";
        names[4] = "Саша";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
