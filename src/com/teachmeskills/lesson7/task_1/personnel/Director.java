package com.teachmeskills.lesson7.task_1.personnel;

import com.teachmeskills.lesson7.task_1.demeanor.IJobTitle;

public class Director implements IJobTitle {
    public String name, surname, patronymic, position;
    public int age, id;

    public Director(String name, String surname, String patronymic, String position, int age, int id) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.age = age;
        this.id = id;
    }

    @Override
    public void outputJobTitle() {
        System.out.println("The job code belongs to " + surname + " " + name + " " + patronymic +
                ", who holds the position " + position);
    }
}
