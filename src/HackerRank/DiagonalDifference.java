package com.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        int n=3;
        int[][] arrInput = {{1, 2, 3},
                            {4, 5, 6},
                            {9, 8, 9}};
        List<List<Integer>> inputList= new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++){
            inputList.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                inputList.get(i).add(arrInput[i][j]);
            }
        }
        System.out.println(diagonalDifference(inputList));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int diag00=0;
        int diag20=0;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                if(i==j){
                    diag00+=arr.get(i).get(j);
                }   if(j==arr.get(i).size()-1-i){
                    diag20+=arr.get(i).get(j);
                }

            }
        }
        return Math.abs(diag00-diag20);
    }
}
