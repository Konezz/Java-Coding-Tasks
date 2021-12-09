package com.HackerRank;

import java.util.*;

public class LonelyNumber {
    public static void main(String[] args) {
        Integer []arr=new Integer[]{1,2,3,4,3,2,1};
        List<Integer> input= Arrays.asList(arr);
        System.out.println(lonelyinteger(input));
    }
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        ArrayList<Integer> arrayList=new ArrayList<>(a);
        //System.out.println(arrayList);
        int count=0;
        int lonelyNumber=0;
        for(int i=0;i<arrayList.size();i++){
            for(int j=0;j<arrayList.size();j++){
                if(arrayList.get(i).equals(arrayList.get(j))){
                    count++;
                }
            }
            if(count==1){
                lonelyNumber=arrayList.get(i);
            }
            count=0;
        }
        return lonelyNumber;
    }
}
