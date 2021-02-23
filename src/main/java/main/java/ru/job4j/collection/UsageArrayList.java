package main.java.ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Petr");
        stringArrayList.add("Ivan");
        stringArrayList.add("Stepan");
        for (String element: stringArrayList) {
            System.out.println(element);
        }
    }
}
