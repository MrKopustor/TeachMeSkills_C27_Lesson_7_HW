package com.teachmeskills.lesson7.task_1.personnel;

import com.teachmeskills.lesson7.task_1.demeanor.IJobTitle;

public class Worker implements IJobTitle {
    public String name, surname, position, division;
    public int age, id;

    public Worker(String name, String surname, String position, String division, int age, int id) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.division = division;
        this.age = age;
        this.id = id;
    }

    @Override
    public void outputJobTitle() {
        System.out.println("The job code belongs to " + surname + " " + name +
                ", who holds the position " + position);
    }
}
