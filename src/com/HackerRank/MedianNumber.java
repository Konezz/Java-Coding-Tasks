package com.HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianNumber {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(5);
        nums.add(2);
        nums.add(4);
        nums.add(3);
//    for(int i=0;i<7;i++){
//        nums.add(i);
//    }
        System.out.println(median(nums));
    }

    public static int median(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size()/2);
    }
}
