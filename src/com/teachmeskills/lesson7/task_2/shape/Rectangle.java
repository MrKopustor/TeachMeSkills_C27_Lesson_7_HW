package com.teachmeskills.lesson7.task_2.shape;

/**
 * Create the Rectangle class and inherit the BaseShape class
 * Create fields for the Rectangle
 * Create constructor
 * Inherit methods getPerimeterShape, getFigureShape and info
 * Fill the bodies of the methods
 */

public class Rectangle extends BaseShape {

    double s, p, length, width;

    public Rectangle(String nameShape, double length, double width) {
        super(nameShape);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeterShape() {
        p = 2 * (width + length);
        return p;
    }

    @Override
    public double getFigureShape() {
        s = width * length;
        return s;
    }

    public void info() {
        System.out.println("side length = " + length + ", width length = " + width +
                ", perimeter = " + getPerimeterShape() + ", figure = " + getFigureShape() + "\n");
    }
}
