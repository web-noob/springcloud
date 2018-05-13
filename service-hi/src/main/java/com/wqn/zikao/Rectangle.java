package com.wqn.zikao;

public class Rectangle extends Shape {
    double a,b;
    Rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }

    @Override
    double getArea() {
        return a*b;
    }

    @Override
    double getPerimeter() {
        return (a+b)*2;
    }
}
