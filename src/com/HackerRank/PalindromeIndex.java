package com.HackerRank;

public class PalindromeIndex {
    public static void main(String[] args) {
        String input="cbcb";
        System.out.println(palindromeIndex(input));
    }
    public static int palindromeIndex(String s) {
        // Write your code here
        int index=0;
        StringBuilder sb=new StringBuilder();
        String reverse="";
        for(int j=s.length()-1;j>=0;j--){
            reverse=reverse+s.charAt(j);
        }
        if(s.equals(reverse)){
            index=-1;
        } else {
            for (int i = 0; i < s.length(); i++) {
                String minusOne = s.substring(0, i) + s.substring(i+1);

                reverse = sb.append(minusOne).reverse().toString();
                if (minusOne.equals(reverse)) {
                    index = i;
                    break;
                }
                sb.delete(0,minusOne.length());
            }
        }
        return index;
    }
}
