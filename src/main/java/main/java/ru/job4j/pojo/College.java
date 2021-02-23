package main.java.ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Aleksandr Khvostov");
        student.setGroup("102");
        student.setDate(new Date());

        System.out.println(student.getFio() + " group number " + student.getGroup() + " : " + student.getDate().toString());
    }
}
