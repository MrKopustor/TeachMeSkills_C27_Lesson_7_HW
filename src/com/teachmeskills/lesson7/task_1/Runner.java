package com.teachmeskills.lesson7.task_1;

import com.teachmeskills.lesson7.task_1.demeanor.IJobTitle;
import com.teachmeskills.lesson7.task_1.personnel.Accountant;
import com.teachmeskills.lesson7.task_1.personnel.Director;
import com.teachmeskills.lesson7.task_1.personnel.Worker;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        IJobTitle iJobTitle1 = new Director("Bob", "Tomoni", "Olegovich", "Director organizations", 39, 1);
        IJobTitle iJobTitle2 = new Worker("Stiv", "Polds", "Construction worker", "internal work", 24, 2);
        IJobTitle iJobTitle3 = new Accountant("Polina", "Astapchik", "Accountant", 33, 3);

        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Enter the job code");
            while (!scanner.hasNextInt()) {
                System.out.println("Error! The access code must be one of the options \"1\", \"2\", \"3\".  ");
                scanner.next();
            }
            userInput = scanner.nextInt();

        } while (userInput < 0);

        switch (userInput) {
            case 1:
                iJobTitle1.outputJobTitle();
                break;
            case 2:
                iJobTitle2.outputJobTitle();
                break;
            case 3:
                iJobTitle3.outputJobTitle();
                break;
            default:
                System.out.println("Error! There is no such job code");
        }
        scanner.close();
    }
}
