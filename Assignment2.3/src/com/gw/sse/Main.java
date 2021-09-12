package com.gw.sse;

class Circle implements Shape {
    @Override
    public double calculateArea() {
        return radius * radius * 3.14159;
    }

    @Override
    public void display() {
        System.out.println("Circle-----------");
        System.out.println("Area: " + area + ", Radius: " + radius);
    }

    public Circle(int r){
        radius = r;
        area = calculateArea();
    }

    private double area;
    private double radius;
}

class Rectangle implements Shape {
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void display() {
        System.out.println("Rectangle--------");
        System.out.println("Area: " + area + ", Length: " + length + ", Width: " + width);
    }

    public Rectangle(double l, double w){
        length = l;
        width = w;
        area = calculateArea();
    }

    private double length;
    private double width;
    private double area;
}

class Triangle implements Shape {
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void display() {
        System.out.println("Triangle---------");
        System.out.println("Area: " + area + ", Base: " + base + ", Height: " + height);
    }

    public Triangle(double b, double h){
        base = b;
        height = h;
        area = calculateArea();
    }

    private double base;
    private double height;
    private double area;
}

public class Main {

    public static void main(String[] args) {
	    Circle shape1 = new Circle(4);
        Rectangle shape2 = new Rectangle(3,5);
        Triangle shape3 = new Triangle(2,8);
        shape1.display();
        shape2.display();
        shape3.display();
    }
}
