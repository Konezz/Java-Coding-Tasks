package com.CTP;

import java.util.*;

/*
Print third non-repeated character in a string
Input: String str = "The weather today is beautiful";
Output: ‘o’;
 */
public class ThirdNonRepeated {
    public static void main(String[] args) {
        String str = "The weather today is beautiful";
        char[] charr=str.toLowerCase().toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=charr[i];
            int count=0;
            for(int j=0;j<str.length();j++){
                if(ch==str.toLowerCase().charAt(j)){
                    count++;
                }
            }
            if(count==1){
                sb.append(charr[i]);
            }
        }
        System.out.println(sb.toString().charAt(2));
    }
}
