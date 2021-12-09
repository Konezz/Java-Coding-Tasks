package com.CTP;

import java.util.Arrays;
import java.util.List;

/*
Write the logic that picks largest and second largest numbers from a list add them and return the results.
input to method is a list that contains the numbers input [10,20,30,40]
output [70]
input[5,3,8,9,10,11,5]
output [21]
 */
public class Repl222 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> inputList= Arrays.asList(5,3,8,9,10,11,5);
        System.out.println(findMaxSum(inputList));
    }

    public static int findMaxSum(List<Integer> list) {
    int max1=0;
    int max2=0;
    for(Integer num:list){
        if(max1<num){
            max2=max1;
            max1=num;
        }
    }
    return max1+max2;
    }
}
