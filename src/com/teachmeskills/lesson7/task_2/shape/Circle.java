package com.teachmeskills.lesson7.task_2.shape;

public class Circle extends BaseShape {
    double pi = 3.14, radius, p, s;

    public Circle(String nameShape, double radius) {
        super(nameShape);
        this.radius = radius;
    }

    @Override
    public void getPerimeterShape() {
        p = 2 * pi * radius;
    }

    @Override
    public void getFigureShape() {
        s = pi * Math.pow(radius, 2);
        System.out.println(s);
    }

}
