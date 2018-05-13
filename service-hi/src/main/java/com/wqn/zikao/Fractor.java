package com.wqn.zikao;

public class Fractor {
    int m;  //分子
    int n;  //分母
    Fractor(int m,int n){
        int c=factor(Math.abs(m),Math.abs(n));   //计算最大公约数
        this.m=m/c;
        this.n=n/c;
        if(m<0&&n<0){
            m=-m;
            n=-n;
        }
    }
    int getNumerator(){
        return m;
    }
    int getDenominator(){
        return n;
    }

    private int factor(int k,int v){
        int i;
        if(k>v){
            int l=k;
            k=v;
            v=l;
        }
        for(i=k;i>0;i--){
            if(v%i==0&&k%i==0)
                break;
        }
        return i;
    }

    Fractor add(Fractor a){
        int k=a.getNumerator();
        int v=a.getDenominator();
        int newM=m*v+n*k;
        int newN=n*v;
        Fractor result = new Fractor(newM,newN);
        return result;
    }

    Fractor sub(Fractor a){
        int k=a.getNumerator();
        int v=a.getDenominator();
        int newM=m*v-n*k;
        int newN=n*v;
        Fractor result=new Fractor(newM,newN);
        return result;
    }

    void display(){
        int m=getNumerator();
        int n=getDenominator();
        System.out.println(+m+"/"+n);
    }
}
