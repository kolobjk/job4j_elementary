package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] values, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Элемент в массиве не найден");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String[] values = {"a", "b", "c"};
            FindEl.indexOf(values, "d");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}