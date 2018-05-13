package com.wqn.zikao;

public class Java11 {

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(10,20);
        Circle circle = new Circle(10);
        System.out.println("长方形的面积:"+rectangle.getArea());
        System.out.println("长方形的周长:"+rectangle.getPerimeter());
        System.out.println("圆的面积:"+circle.getArea());
        System.out.println("圆的周长:"+circle.getPerimeter());
    }
}
