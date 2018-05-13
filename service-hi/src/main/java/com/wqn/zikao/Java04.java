package com.wqn.zikao;

public class Java04 {

    public static void main(String args[]){
        Fractor r1=new Fractor(-2,9);
        Fractor r2=new Fractor(3,7);
        System.out.println("第一个分数是:");
        r1.display();
        System.out.println("第二个分数是:");
        r2.display();
        Fractor result1=r1.add(r2);
        Fractor result2=r1.sub(r2);
        System.out.println("两分数之和:");
        r1.display();
        System.out.println("+");
        r2.display();
        System.out.println("=");
        result1.display();
    }
}
