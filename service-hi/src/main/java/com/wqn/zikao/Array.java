package com.wqn.zikao;

public class Array {

    int array[]=new int[10];
    Array(){
        int i;
        for(i=0;i<array.length;i++)
            array[i]=i;
    }
    int getSum(){
        int i,sum=0;
        for(i=0;i<array.length;i++)
            sum+=array[i];
        return sum;
    }

    void display(){
        System.out.println("total="+getSum());
    }
}
