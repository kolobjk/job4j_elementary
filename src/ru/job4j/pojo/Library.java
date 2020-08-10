package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 10);
        Book far = new Book("Far", 4);
        Book code = new Book("Code", 19);
        Book java = new Book("Java", 19);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = far;
        books[2] = code;
        books[3] = java;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getCount());
        }
        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getCount());
        }
        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(books[i].getName() + " - " + books[i].getCount());
            }
        }
    }
}
