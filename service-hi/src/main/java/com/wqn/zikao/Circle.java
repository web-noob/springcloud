package com.wqn.zikao;

public class Circle extends Shape {
    double r;
    Circle(double r){
        this.r=r;
    }

    @Override
    double getArea() {
        return 3.14*r*r;
    }

    @Override
    double getPerimeter() {
        return 3.14*r*2;
    }
}
