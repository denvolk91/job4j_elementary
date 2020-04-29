package main.java.ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Волк Денис Васильевич");
        student.setGroup("ТОПСХП");
        student.setAdmission(new Date());

        System.out.println(student.getName() + " поступил в " + student.getGroup() + " " + student.getAdmission());
    }
}
