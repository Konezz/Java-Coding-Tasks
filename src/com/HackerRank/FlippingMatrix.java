package com.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlippingMatrix {
    public static void main(String[] args) {
      Integer[][] matrix =new Integer[][] {  {112, 42, 83, 119},
                                              {56, 125, 56, 49},
                                              {15, 78, 101, 43},
                                              {62, 98, 114, 108}};
      List<List<Integer>> matrixList=new ArrayList<List<Integer>>();
      for(int i=0;i<matrix.length;i++){
          matrixList.add(new ArrayList<>());
          for(int j=0;j<matrix[i].length;j++){
              matrixList.get(i).add(matrix[i][j]);
          }
      }
        System.out.println("1"+matrixList);
      flippingMatrix(matrixList);

    /*
    112 42 83 119
        56 125 56 49
        15 78 101 43
        62 98 114 108
         answer 414
         */
    }
    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int n=matrix.size()/2;
        int sum=0;
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a=Math.max((int)(matrix.get(i).get(j)), (int)(matrix.get(n*2-1-i).get(j)));
                b=Math.max((int)(matrix.get(i).get(n*2-1-j)), (int)(matrix.get(n*2-1-i).get(n*2-1-j)));
                sum+=Math.max(a,b);
            }
        }
        return sum;
    }
}
