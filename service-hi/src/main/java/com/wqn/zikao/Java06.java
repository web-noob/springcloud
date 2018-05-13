package com.wqn.zikao;

public class Java06 {

    public static void main(String[] args){
        int[] arrayOfInts={32,87,589,12,1076,2000,8,622,127};
        int i,j,temp;
        for(i=0;i<10;i++){
            for(j=0;j<10-i-1;j++){
                if(arrayOfInts[j]>arrayOfInts[j+1]){
                    temp=arrayOfInts[j+1];
                    arrayOfInts[j+1]=arrayOfInts[j];
                    arrayOfInts[j]=temp;
                }
            }
        }
        System.out.println("排序后的数组为:");
        for(i=0;i<10;i++){
            System.out.println(arrayOfInts[i]);
        }
    }
}
