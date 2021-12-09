package com.CTP;
/*
Write a Java Program to find whether a String is a palindrome or not.
 */
public class Palindrome {
    public static void main(String[] args) {
        String input="abbab";
        StringBuilder sb=new StringBuilder(input);
        boolean isPalindrome=false;
        String reverse="";
        for(int i=input.length()-1;i>=0;i--){
            reverse=reverse+input.charAt(i);
        }
        if(reverse.equals(input)){
            isPalindrome=true;
        }
//        if(input.equals(sb.reverse().toString())){
//            isPalindrome=true;
//        }
        System.out.println("String is "+isPalindrome+" palindrome");
    }
}
