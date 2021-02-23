package main.java.ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Aleksandr";
        int age = 33;

        ArgMethod.hello(name);

        ArgMethod.hello(name);

        ArgMethod.hello(String.valueOf(age));

        ArgMethod.hello(name);
    }
}