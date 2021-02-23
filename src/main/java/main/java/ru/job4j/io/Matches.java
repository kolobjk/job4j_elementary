package main.java.ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int countOfmatches = 11;
        Scanner input = new Scanner(System.in);
        while (countOfmatches > 0) {
            System.out.print("Введите число от 1 до 3 ");
            int number = Integer.valueOf(input.nextLine());
            switch (number) {
                case 1, 2, 3 :
                    countOfmatches -= number;
                    break;
                default:
                    System.out.println("Введено неправильное число, попробуйте еще раз");
                    break;
            }
            System.out.println("Осталось спичек: " + countOfmatches);
        }
    }
}
