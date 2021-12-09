package com.HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMax4outOf5 {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        MinMax(nums);
    }

    public static void MinMax(List<Integer> arr) {
        long maxSum = 0;
        long minSum = 0;

        Collections.sort(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            minSum += arr.get(i);
        }
        for (int j = 1; j < arr.size(); j++) {
            maxSum += arr.get(j);
        }
        System.out.print(minSum+" "+maxSum);
    }
}
