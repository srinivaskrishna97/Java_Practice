package com.company;

public class TernaryOperator {

    public static void main(String[] args) {

        int a=5,b=11,c=9,d=9,result=10;

        result = result > a ? result : a;
        result = result > b ? result : b;
        result = result > c ? result : c;
        result = result > d ? result : d;

        System.out.println(result);
    }
}
