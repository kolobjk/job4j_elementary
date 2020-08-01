package ru.job4j.oop;

public class Student {

    public void song() {
        System.out.println("Tra tra tra");
    }

    public void music() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}