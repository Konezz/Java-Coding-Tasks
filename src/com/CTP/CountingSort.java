package com.CTP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {
    public static void main(String[] args) {
    List<Integer> inputList=new ArrayList<>();
    inputList.add(1);
    inputList.add(1);
    inputList.add(3);
    inputList.add(2);
    inputList.add(1);

    System.out.println(countingSort(inputList));
    }
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
    List<Integer> resultList=new ArrayList<>();
    int[] result=new int[100];
    for(Integer num:arr){
        result[num]+=1;
    }
    for(int freq:result){
        resultList.add(freq);
    }
    return resultList;
    }
}
