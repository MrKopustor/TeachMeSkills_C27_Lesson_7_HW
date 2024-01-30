package com.teachmeskills.lesson7.task_2.shape;

/**
 * Create the Square class and inherit the BaseShape class
 * Create fields for the Square
 * Create constructor
 * Inherit methods getPerimeterShape, getFigureShape and info
 * Fill the bodies of the methods
 */

public class Square extends BaseShape {
    double s, p, side;

    public Square(String nameShape, double side) {
        super(nameShape);
        this.side = side;
    }

    @Override
    public double getPerimeterShape() {
        p = 4 * side;
        return p;
    }

    @Override
    public double getFigureShape() {
        s = Math.pow(side, 2);
        return s;
    }

    public void info() {
        System.out.println("side length = " + side + ", perimeter = " + getPerimeterShape() +
                ", figure = " + getFigureShape() + "\n");
    }
}
