package com.CTP;
/*
Write a Java Program to print the first 10 numbers of Fibonacci series.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int[] arr=new int[10];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-2]+arr[i-1];
        }
        for(int n:arr){
        System.out.print(n+" ");
         }
    }
}
