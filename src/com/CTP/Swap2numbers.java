package com.CTP;
/*
Write a program to swap 2 numbers without a temporary variable?
Swap 2 strings without a temporary variable?
 */
public class Swap2numbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a + b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);

        String x="XX";
        String y="YYY";
        x=x.concat(y);
        y=x.substring(0,x.length()-y.length());
        x=x.substring(y.length());
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
