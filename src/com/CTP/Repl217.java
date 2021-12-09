package com.CTP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/*
Complete countDuplicates method This method should count how many numbers are appearing more than once and should return the count.

Input [12,12,13,45,78,7,7] output 2

Input [12,12,7,7,7,7,7] output 2

Input [12,120,13,45,78,17,57] output 0

Input [12,12,13,45,78,67,87] output 1
 */
public class Repl217 {
    public static void main(String[] args ){
    //System.out.println("Hello World");
   int[] nums={12,12,13,45,78,67,87};
    List<Integer> list=new ArrayList();
    for(Integer n:nums){
        list.add(n);
    }


    System.out.print(countDuplicates(list));
}

    static int countDuplicates(List<Integer> numbers){
        HashSet<Integer> dupl=new HashSet<>(numbers);
        System.out.println(dupl);
        int duplnum= numbers.size()-dupl.size();
        return duplnum;
    }

}

