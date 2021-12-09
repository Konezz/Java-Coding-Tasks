package com.CTP;
/*
Write a java program to find the second largest number in the array? Maximum
and minimum number in the array?
 */
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, 5, 6, 7, 8, 9};
        int max = 0;
        int max2 = 0;
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max2=max;
            max=arr[i];
        }
        if(min>arr[i]){
            min=arr[i];
        }
        }
        System.out.println("Max number="+max);
        System.out.println("Min number="+min);
        System.out.println("Second max="+max2);
    }
}
