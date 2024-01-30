package com.teachmeskills.lesson7.task_1.personnel;

import com.teachmeskills.lesson7.task_1.demeanor.IJobTitle;

/**
 * Create the Worker class
 * Create fields for Worker
 * Create a constructor with fields for Worker
 * Call the interface method
 * Write the body of the method
 */

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
