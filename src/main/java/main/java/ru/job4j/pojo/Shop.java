package main.java.ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int rs = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                rs = i;
                break;
            }
        }
        return rs;
    }
}