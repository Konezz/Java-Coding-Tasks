package com.CTP;
/*
Write a java program to reverse String? Reverse a string word by word?
 */
public class ReverseAString {
    public static void main(String[] args) {
        String input="Java is cool";
        StringBuilder sb=new StringBuilder(input);
        System.out.println(sb.reverse());

        String reverse="";
        char[] arr=new char[input.length()];
        for(int i=input.length()-1;i>=0;i--){
            reverse=reverse+input.charAt(i);

        }
        System.out.println(reverse);
    }
}
