package com.teachmeskills.lesson7.task_2.shape;

public abstract class BaseShape {

    String nameShape;

    public BaseShape(String nameShape) {
        this.nameShape = nameShape;
    }

    public abstract void getPerimeterShape();

    public abstract void getFigureShape();
}
