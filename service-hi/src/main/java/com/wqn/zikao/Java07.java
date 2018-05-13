package com.wqn.zikao;

public class Java07 {

    public static void main(String[] args){
        int i,sum=0,prod=1;
        for(i=1;i<=20;i++){
            prod*=i;
            sum+=prod;
        }
        System.out.println("1!+2!+3!+...+20!的和是:\n"+sum);
    }
}
