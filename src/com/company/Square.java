package com.company;

public class Square extends GeometricObject implements Colorable{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    public double getSide() {
        return side;
    }

    public double getArea(){
        return side*side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
