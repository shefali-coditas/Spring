package com;

//Triangle and cricle is-a shape
public class Shape
{
    private Triangle triangle;
    private Circle circle;

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    @Override
    public String toString() {
        return "Shape : " +
                "\n" + getTriangle().toString() +
                ",\n" + getCircle().toString();
    }
}
